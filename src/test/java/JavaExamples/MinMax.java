package JavaExamples;

/**
 * Created by pavani on 9/4/17.
 */
public class MinMax {

    public static boolean minmax(int[] x,int expetedLarge,int exptedSmall)
    {
        int large = x[0];
        int small = x[0];
        for (int i=1; i<x.length;i++)
        {
            if(large<x[i]){
                large = x[i];
            }
            if(small>x[i]){
                small = x[i];
            }

        }

        System.out.println("Large = "+large);
        System.out.println("Small = "+small);

        if(large==expetedLarge && small==exptedSmall)
        {
            return  true;
        }
        else
            return false;
    }

    public static void main(String[] args) {
    }
}
