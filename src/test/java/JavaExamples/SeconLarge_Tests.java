package JavaExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by pavani on 9/5/17.
 */
public class SeconLarge_Tests {

    @Test

    public void tests()
    {
        int x[] = new int[]{100,51,20,34,27,87,1};


        Assert.assertTrue(SecondLargest.secLarge(x,100,87),"Failed to find");

    }
}
