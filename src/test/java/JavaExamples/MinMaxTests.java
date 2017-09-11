package JavaExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by pavani on 9/4/17.
 */
public class MinMaxTests {

    @Test

    public void tests()
    {
        int x[] = new int[]{4,89,33,-1,80,64,1};


        Assert.assertTrue(MinMax.minmax(x,89,-1),"Failed to find min max");


        Assert.assertFalse(MinMax.minmax(x,89,-1),"Failed to find min max");
    }
}
