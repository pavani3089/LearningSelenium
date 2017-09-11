package JavaExamples;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by pavani on 9/4/17.
 */
public class StringNUMBERS {

    public static void main(String[] args) {

        String str = "ac12dec45";
        String s1="abcadfaeg";
        String s2="abc def abc xyz amf xuf";

        char c[] = s1.toCharArray();
        HashMap<Character,Integer> hmap = new HashMap<Character, Integer>();
        for (int i = 0; i <c.length ; i++) {

            if(hmap.containsKey(c[i])){
                hmap.put(c[i],hmap.get(c[i])+1);
            }
            else{
                hmap.put(c[i],1);
            }

        }
        for (Map.Entry m:hmap.entrySet()) {
            int x = (Integer) m.getValue();
            if(x>1) {
                System.out.println(m.getKey() + "--->" + m.getValue());
            }

        }
        for (int i = 0; i <c.length ; i++) {
            if(!Character.isDigit(c[i])){
                c[i] = ' ';
            }

        }

        String a = new String(c);
        System.out.println();
        String[] str1 = a.split(" ");
        int total = 0;
        for (String s: str1) {

            if(!s.equals("")){
                total = total+Integer.parseInt(s);
            }

        }
        System.out.println(total);
    }

    public static boolean numTotal(String s, int expected){
        char c[] = s.toCharArray();
        int total = 0;
        for (int i = 0; i < c.length; i++) {

            if (Character.isDigit(c[i])) {
                int num = Character.getNumericValue(c[i]);
                total = total+num;
            }

        }

        System.out.println(total);

        if(total==expected){
            return true;
        }
        else {
            return false;
        }
    }
}
