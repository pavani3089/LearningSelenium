package JavaExamples;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by pavani on 9/21/17.
 */
public class PrimeNumber {


    public static boolean primeCheck(int n)
    {
          int i,m=0,flag=0;

          m=n/2;
          for(i=2;i<=m;i++){
           if(n%i==0){
           System.out.println("Number is not prime--->"+n);
           flag=1;
           break;
           }
          }
          if(flag==0)
          {
              return true;
          }
          else
          {
              return false;
          }







    }

    @DataProvider(name="xyz")
    public Object[][] data()
    {
        Object[][] x={{3,true},{4,false},{10,false}} ;
        return x;
    }

    @Test      (dataProvider = "xyz")
    public void testPrime(int num,boolean expectedResult)
    {

        primeCheck(num);
        boolean actualResult = primeCheck(num);
        Assert.assertEquals(actualResult,expectedResult);
    }

}
