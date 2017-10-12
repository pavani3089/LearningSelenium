package JavaExamples;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by pavani on 9/21/17.
 */
public class fibSeries {


    public static int[] fib(int n) {

        int first = 0;
        int second = 1;
        int series[] = new int[n];
        series[0]=first;
        series[1]=second;

        for (int i = 2; i < n; i++) {
            int c=0;
            c=first + second;
            series[i] = c;
            first = second;
            second = c;



        }



        return series;
    }


    public static void main(String[] args) {
        int[] x=fib(3);

        for(int i:x)
        {
            System.out.print(i+" ");
        }

    }


    @DataProvider(name = "fib")

    public Object[][] fibData() {

        Object[][] x = new Object[][]{ {3,new int[] {0, 1, 1}}, {4, new int[]{0, 1, 1, 2}}};

        return x;

    }

    @Test(dataProvider = "fib")
    public void testFibSeries(int n,int expectedSeries[]) {

        fibSeries f = new fibSeries();
        System.out.println();
        System.out.println("*****");
        int[] f1=f.fib(n);


        System.out.println("*****");
        Assert.assertEquals(f1, expectedSeries);



    }



}
