package JavaExamples;

/**
 * Created by pavani on 9/15/17.
 */
public class ArraySort {

    public static void main(String[] args)
    {
        int a[] = { 10, 5, 15 };
        int b[] = { 20, 3, 2, 12 };
        int m = a.length;
        int n = b.length;

        int temp=0;
        /*for (int i=0; i<a.length;i++)
        {
            int x= a[0];
            int y = a[1];
            if(x>y){
                temp = a[i];
                a[i]=a[i+1];
                a[i+1]= temp;
            }
            System.out.println(a[i]);


        }*/

        int x = a[0];
        for (int i = 1; i<m; i++) {
            if (x > a[i]) {
                temp = x;
                x=a[i];
                a[i]= temp;
            }


        }

        System.out.println(a);



    }
}
