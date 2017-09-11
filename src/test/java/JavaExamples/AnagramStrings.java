package JavaExamples;

import java.util.Arrays;

/**
 * Created by pavani on 9/5/17.
 */
public class AnagramStrings {
    public static void main(String[] args) {
        //String word = "Stop";
        //String anag_word = "Post";
        AnagramStrings obj = new AnagramStrings();
        obj.checkanagram("Stop","Post");
    }

    public boolean checkanagram(String word, String anag_word){

        String s1 = word.toUpperCase();
        String s2= anag_word.toUpperCase();
        if(s1.length() != s2.length()){
            System.out.println("Strings are not equal");
            return false;
        }
        //System.out.println(s1);
        //System.out.println(s2);
        char[] cword = s1.toCharArray();
        char[] canag_word = s2.toCharArray();
        Arrays.sort(cword);
        Arrays.sort(canag_word);
        boolean result = Arrays.equals(cword,canag_word);
        System.out.println(result+" Anagrams");
        return result;
    }
}
