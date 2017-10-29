package JavaExamples;

/**
 * Created by pavani on 10/12/17.
 */
public class FactorialEx {




    public static int fact(int x){
        int fact=1;
        for(int i=1;i<=x; i++){
            fact=fact*i;

        }
        //System.out.println("Factorial of "+x+"! is "+fact);
        return fact;

    }

    public static int factrecursion(int x){

        int temp =1;
        if(x ==1){
            return 1;
        }

        temp = x*factrecursion(x-1);
        return temp;
    }


    public static void main(String[] args) {

        int num = 5;
        //fact(num);
        System.out.println(factrecursion(5));

    }
}
