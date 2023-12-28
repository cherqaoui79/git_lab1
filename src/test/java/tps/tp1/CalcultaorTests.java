package tps.tp1;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CalcultaorTests extends TestCase {
    @Test
    public void sum() {
        int a=10;
        int b=20;
        int expectedResult=a+b;
        int result=Calculator.sum(a,b);
        Assertions.assertEquals(expectedResult+10,result);
    }

    @Test
    public void multi() {
        int a=10;
        int b=10;
        int expectedResult=a*b;
        int result=Calculator.multi(a,b);
        Assertions.assertEquals(expectedResult,result);
    }

}
