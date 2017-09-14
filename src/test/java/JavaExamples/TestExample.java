package JavaExamples;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by pavani on 9/11/17.
 */
public class TestExample {

    public static void main(String[] args) {
        int[] a = new int[]{2,5,3,1,200,56,100};
        int[] b = new int[]{10,3,4,5,50,100,1,121,4};
        TestExample.arrayProg2(a, b);
    }

   /* public static void arrayProg(int[] a, int[] b){
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for (int i = 0,j=0; i < a.length && j< b.length ; i++,j++) {
            if(hm.containsKey(a[i]) || hm.containsKey(b[j])){
                hm.put(a[i],hm.get(a[i])+1);
                hm.put(b[j],hm.get(b[j])+1);
            }
            else{
                hm.put(b[j],1);
                hm.put(a[i],1);
            }
        }
        for (Map.Entry m:hm.entrySet()) {

            System.out.println(m.getKey() + "--->" + m.getValue());

        }*/

    public static void arrayProg2(int[] a, int[] b) {
        //boolean contains = false;

        int[] d = new int[a.length+b.length];
        System.arraycopy(a, 0, d, 0, a.length);
        System.arraycopy(b, 0, d, a.length, b.length);
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

        for (int i = 0; i< d.length; i++) {
            if(hm.containsKey(d[i])){
                hm.put(d[i],hm.get(d[i])+1);
            }
            else{
                hm.put(d[i],1);
            }

        }
        for (Map.Entry m:hm.entrySet()) {

            System.out.println(m.getKey() + "--->" + m.getValue());

        }



    }

}
