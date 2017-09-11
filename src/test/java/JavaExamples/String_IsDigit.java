package JavaExamples;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * Created by pavani on 9/5/17.
 */
public class String_IsDigit {
    public static void main(String[] args) {
        String str = "2134";
        String_IsDigit.isDigit(str);
      //  String_IsDigit.useRegExp(str);
    }

    public static void isDigit(String str){
        char[] word = str.toCharArray();
        int flag=0;
        for (char c:word) {
            if(!Character.isDigit(c)){

                flag = 1;
                break;
            }
            else{

            }

        }

        if(flag==1){
            System.out.println(str+" :String contains characters ");
        }
        else
            System.out.println(str+" :String contains only numbers ");

    }

    public static void useRegExp(String str){
        Pattern pattern = Pattern.compile(".*[^0-9].*");
        //Pattern pattern = Pattern.compile(".*//D.*");
        System.out.println("Does "+str+" is Digit: "+!pattern.matcher(str).matches());

    }
}
