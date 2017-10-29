package JavaExamples;

/**
 * Created by pavani on 10/13/17.
 */
public class CountDigits {
    public static int count7(int num){

        int total=0, temp;
        for (int i = num; i > 0 ; i--) {
            temp = num % 10;
            if(temp == 7){
                total++;
            }
            num = num / 10;

        }

        return total;

    }

    public static int count7Recurs(int num){
        if(num == 0){
            return 0;
        }
        int temp=num%10;
        if(temp==7) {
            return 1+count7Recurs(num/10);
        }
        return count7Recurs(num/10);
    }

    public static void main(String[] args) {
        int num = 78987277;
        System.out.println(count7Recurs(num));
    }
}
