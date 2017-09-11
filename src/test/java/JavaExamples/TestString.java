package JavaExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by pavani on 9/4/17.
 */
public class TestString {
    @Test

    public void tests(){
        String s = "abc123def01x456";
        Assert.assertTrue(StringNUMBERS.numTotal(s,22),"Failed to get the total");


    }
}
