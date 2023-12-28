package tps.tp1;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class CalcultaorTests {
    @Test
    public void sum() {
        int a=10;
        int b=20;
        int expectedResult=a+b;
        int result=Calculator.sum(a,b);
        Assert.assertEquals(expectedResult,result);
    }

    @Test
    public void multi() {
        int a=10;
        int b=10;
        int expectedResult=a*b;
        int result=Calculator.multi(a,b);
        Assert.assertEquals(expectedResult,result);
    }

}
