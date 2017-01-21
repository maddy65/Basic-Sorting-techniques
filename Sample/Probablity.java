import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

    public static void main(String[] args) throws Exception {
        String fileName = "C:\\Users\\I318988\\Desktop\\hackethon\\Dataset\\Training.csv";
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File(fileName))));

        //model list
        List<Map<String, Map<String, Integer>>> model = new ArrayList<Map<String, Map<String, Integer>>>();

        Map<String, Integer> allClassesCount = new HashMap<String, Integer>();
        int[] realnuber = { 1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                1, 1, 1, 1 };

        for (int i = 0; i < 41; i++) {
            model.add(new HashMap<String, Map<String, Integer>>());
        }
        System.out.println(realnuber.length);
        while (true) {
            String line = br.readLine();
            if (line == null)
                break;

            //System.out.println(line);
            String[] attrbutelist = line.split(",");
            String lastattr = attrbutelist[41];

            //update final result count
            increseCount(allClassesCount, lastattr);

            //update count for individual attribute
            for (int i = 0; i < 41; i++) {
                if (realnuber[i] == 1)
                    continue;

                String attr = attrbutelist[i];
                Map<String, Map<String, Integer>> tempMap = model.get(i);
                updateMap(tempMap, attr, lastattr);
                model.set(i, tempMap);
            }

        }

        String[] classes = { "back.", "buffer_overflow.", "ftp_write.", "guess_passwd.", "imap.", "ipsweep.", "land.", "loadmodule.",
                "multihop.", "neptune.", "nmap.", "normal.", "perl.", "phf.", "pod.", "portsweep.", "rootkit.", "satan.", "smurf.", "spy.",
                "teardrop.", "warezclient.", "warezmaster." };

        for (int i = 0; i < 41; i++) {
            if (realnuber[i] == 1)
                continue;

            Map<String, Map<String, Integer>> tempmap = model.get(i);
            for (Map.Entry<String, Map<String, Integer>> attributeValue : tempmap.entrySet()) {
                String key = attributeValue.getKey();
                Map<String, Integer> someMape = tempmap.get(key);
                for (int j = 0; j < classes.length; j++) {
                    if (!someMape.containsKey(classes[j])) {
                        someMape.put(classes[j], 0);
                    }
                }

                tempmap.put(key, someMape);
            }
        }
        //print total count
        System.out.println("Total Count of classes");
        System.out.println("========================");
        System.out.println(allClassesCount);

        System.out.println("Attribute Dependecy");
        System.out.println("=====================");

        for (Map<String, Map<String, Integer>> attributemodel : model) {
            System.out.println(attributemodel);
        }

        //do the real thing
        fileName = "C:\\Users\\I318988\\Desktop\\hackethon\\Dataset\\Testing.csv";
        br = new BufferedReader(new InputStreamReader(new FileInputStream(new File(fileName))));
        while (true) {
            String line = br.readLine();
            if (line == null)
                break;

            String[] attrbutelist = line.split(",");
            Map<String, Double> probabilityMap = new HashMap<String, Double>();

            System.out.println(line);
            for (int i = 0; i < 41; i++) {
                if (realnuber[i] == 1)
                    continue;

                String attr = attrbutelist[i];
                Map<String, Map<String, Integer>> tempmap = model.get(i);
                Map<String, Integer> countMap = tempmap.get(attr);

                for (Map.Entry<String, Integer> indiviualCount : countMap.entrySet()) {
                    String className = indiviualCount.getKey();
                    int occurredCount = indiviualCount.getValue();
                    Integer totalCount = allClassesCount.get(className);
                    if (totalCount == null)
                        continue;
                    double currentProbibilty = occurredCount / (totalCount * 1.0);
                    currentProbibilty *= totalCount;

                    if (probabilityMap.containsKey(className)) {
                        double storedProbability = probabilityMap.get(className);
                        probabilityMap.put(className, storedProbability * currentProbibilty);
                    } else {
                        probabilityMap.put(className, currentProbibilty);
                    }

                }

            }

            String ans = "";
            double max = -1;
            for (Map.Entry<String, Double> prob : probabilityMap.entrySet()) {
                if (prob.getValue() > max) {
                    ans = prob.getKey();
                    max = prob.getValue();
                }
            }
            System.out.println(probabilityMap);
            System.out.println(ans);
        }

    }

    private static void updateMap(Map<String, Map<String, Integer>> attributeMap, String attrkey, String lastattr) {
        if (attributeMap == null)
            attributeMap = new HashMap<String, Map<String, Integer>>();

        Map<String, Integer> tempMap = attributeMap.get(attrkey);
        if (tempMap == null) {
            tempMap = new HashMap<String, Integer>();
        }

        increseCount(tempMap, lastattr);
        attributeMap.put(attrkey, tempMap);

    }

    private static void increseCount(Map<String, Integer> tempMap, String attr) {
        if (tempMap.containsKey(attr)) {
            int count = tempMap.get(attr);
            count++;
            tempMap.put(attr, count);
        } else {
            tempMap.put(attr, 1);
        }

    }

}
