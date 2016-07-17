package HashSet;
import java.util.*;

public class Product {

	public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        v.addElement("RED");
        v.addElement("BLUE");
        v.addElement("GREEN");
        Vector<String> v2 = new Vector<>();
        Vector<String> v3;
        Vector<Vector<String>> v4 = new Vector<>();
        v2.addElement("CSK");
        v2.addElement("RCB");
        v2.addElement("MI");
        for (String vector_v : v) {
            for (String vector_v2 : v2) {
                v3 = new Vector<>(); // this declares new vector every time and this new vector is
                                    //  added to v4 and thus the list goes
                v3.add(vector_v2);
                v3.add(vector_v);
                v4.add(v3);
            }
        }
        System.out.println(v4);
    }}