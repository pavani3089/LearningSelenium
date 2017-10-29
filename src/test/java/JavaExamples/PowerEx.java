package JavaExamples;

import java.security.PublicKey;

/**
 * Created by pavani on 10/12/17.
 */
public class PowerEx {

    public static int powerEx(int base, int n){
        int temp=1;
        for(int i=1;i<=n;i++)
        {
            temp=temp*base;



        }

        return temp;

    }

    public static int powerExRecur(int base, int n){

        int temp;
        if(base>1 && n == 0){
            return 1;
        }
        if(base==0 && n>=0){
            return 0;
        }
        if(n==1){
            return base;
        }

        temp = base*powerExRecur(base,n-1);
        return temp;

    }

    public static void main(String[] args) {

        int base=2,n=10;
        System.out.println(powerExRecur(base,n));

    }
}
