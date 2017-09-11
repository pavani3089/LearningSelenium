package JavaExamples;


/**
 * Created by pavani on 9/5/17.
 */
public class SecondLargest {
    public static boolean secLarge(int[] x, int expectedLarge, int expectedSecondLarge) {
        int large = 0;
        int sec_large = 0;
        for (int i = 0; i < x.length; i++) {
            if (large < x[i]) {
                sec_large = large;
                large = x[i];
            } else if (sec_large < x[i]) {
                sec_large = x[i];
            }
        }

        System.out.println("Largest num = " + large);
        System.out.println("Second largest num = " + sec_large);

        if(large==expectedLarge && sec_large==expectedSecondLarge)
        {
            return  true;
        }
        else
            return false;
    }

    public static void main(String[] args) {
        //int x[] = new int[]{100,51,20,34,27,87,1};
        //SecondLargest.secLarge(x);
    }
}


