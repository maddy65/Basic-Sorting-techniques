import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;

class Procession {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
         int r = sc.nextInt();
         int [] length = new int[r];
         String str[] = new String[r];
         for(int i=0; i<r; i++){
        	 length[i] += sc.nextInt();
        	 str[i] = sc.next();
        }
         System.out.println(Arrays.toString(length));
         System.out.println(Arrays.toString(str));
        /* if(L == str.length() && containsOtherCharacter(str)){
             Match(str);
         }else{
             System.out.println("Invalid");
         }*/
    }
    
    private static void Print(String str){
    	System.out.println("String is: "+str);
    }
    private static void Match(String str) {
        // TODO Auto-generated method stub
        Map counts = getCharFreq(str);
        counts.get('H');
        counts.get('T');
        if(counts.get('H') == counts.get('T')){
            str = str.replace(".", "");//str.replaceAll(".", "");
            char first = str.charAt(0);
            char last = str.charAt(str.length()-1);
            if(first == 'H' && last == 'T'){
                System.out.println("Valid");
            }
            else{
                System.out.println("Invalid");
            }
        }
    }
    public static boolean containsOtherCharacter(String str) {
        return str.replaceAll("[HT.]", "").length()==0;
    }
    public static Map<Character,Integer> getCharFreq(String s) {
          Map<Character,Integer> charFreq = new HashMap<Character,Integer>();
          if (s != null) {
            for (Character c : s.toCharArray()) {
              Integer count = charFreq.get(c);
              int newCount = (count==null ? 1 : count+1);
              charFreq.put(c, newCount);
            }
          }
          return charFreq;
        }

}
