package JavaExamples;

/**
 * Created by pavani on 9/5/17.
 */
public class StringReverse {
    public static void main(String[] args) {
        String str = "Hello world java";
        StringReverse.reverse(str);
        StringReverse.stringBuilderReverse(str);
        System.out.print(StringReverse.reverseRecursively(str));

    }

    public static void  reverse(String str){
        String[] str1 = str.split(" ");
        for (String s:str1) {
            char[] c = s.toCharArray();
            for (int i = c.length-1; i >=0 ; i--) {
                System.out.print(c[i]);
            }
            System.out.print(" ");
        }

    }

    public static void stringBuilderReverse(String str){

        String reverseStr = new StringBuffer(str).reverse().toString();
        System.out.println();
        System.out.println("Reverse String in Java using StringBuffer: " + reverseStr);

    }

    public static String reverseRecursively(String str) {


        if (str.length() < 2) {
            return str;
        }

        return reverseRecursively(str.substring(1)) + str.charAt(0);

    }

}
