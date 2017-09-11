package JavaExamples;

/**
 * Created by pavani on 9/4/17.
 */
public class Prime_num {
    public static void main(String[] args) {
        int num = 121;
        int m = num/2;
        for (int i = 2; i < m ; i++) {

            if(num%i == 0 ){
                System.out.println(num+" is not a prime number");
                break;
            }
            else{
                System.out.println(num+" is a prime number");
                break;
            }

        }
    }
}
