package JavaExamples;

/**
 * Created by pavani on 9/5/17.
 */
public class ConsonantsVowels {
    public static void main(String[] args) {
        String str = "abcdefghi";
        ConsonantsVowels.method(str);
    }
    public static void method(String str){

        char[] s = str.toCharArray();
        int count=0;
        for (char c:s) {
            switch (c){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
                    break;
                    default:

            }
        }
        System.out.println("Number of vowels in '"+str+"': "+count);
        System.out.println("Number of consonants in '"+str+"': "+(str.length()-count));
    }
}
