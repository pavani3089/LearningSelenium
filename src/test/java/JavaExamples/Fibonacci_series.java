package JavaExamples;

import org.testng.annotations.Test;

/**
 * Created by pavani on 9/4/17.
 */
public class Fibonacci_series {
    public static void main(String[] args) {
        int a=0, b=1;
        int c;
        System.out.print(a+" "+b+" ");
        for (int i = 0; i <10 ; i++) {
            c = a+b;
            a=b;
            b=c;

            System.out.print(c+" ");
        }
    }



}
