package JavaExamples;

import java.util.ArrayList;

/**
 * Created by pavani on 9/19/17.
 */
public class B extends A {

    static int l=0;
    int j=0;


    public B()
    {
    System.out.println("Deault Constructor");
    }


    public B(int x)
    {
        System.out.println("argument Constructor");
    }

    static {
        System.out.println("am i First");
    }

    public int x( )
    {

        //this.x();

    System.out.println("in B"+l);

        return 0;
    }


    public int x(int a)
    {

        return 0;
    }
    public int x(float a)
    {

        System.out.println("in float");
        return 0;
    }

    public static void main(String[] args) {

        System.out.println("Am i second");
        B a=new B(10);
        int k=a.x(10);


        try{
            int a1=10/0;
        }
        finally {

        }

        System.out.println(a.j);
    }
}
