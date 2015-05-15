package pl.edu.ug.inf.calc;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import java.math.BigDecimal;

public class CalculatorTest {

    public Calculator calc = new CalculatorImpl();

    @Test
    public void sumTest(){
        assertEquals(new BigDecimal(12.5).setScale(2, BigDecimal.ROUND_HALF_UP), calc.sum(5.2, 7.3));
        assertNotEquals(new BigDecimal(15.7).setScale(2, BigDecimal.ROUND_HALF_UP), calc.sum(5.2, 7.3));
    }

    @Test
    public void subtractTest(){
        assertEquals(new BigDecimal(3.8).setScale(2, BigDecimal.ROUND_HALF_UP), calc.subtract(5.5, 1.7));
        assertNotEquals(new BigDecimal(4.2).setScale(2, BigDecimal.ROUND_HALF_UP), calc.subtract(5.5, 1.7));
    }

    @Test
    public void divideTest(){
        assertEquals(new BigDecimal(3.65).setScale(2, BigDecimal.ROUND_HALF_UP), calc.divide(8.4, 2.3));
        assertNotEquals(new BigDecimal(3.657).setScale(2, BigDecimal.ROUND_HALF_UP), calc.divide(8.4, 2.3));
    }

    @Test
    public void multiplyTest(){
        assertEquals(new BigDecimal(7.44).setScale(2, BigDecimal.ROUND_HALF_UP), calc.multiply(2.4, 3.1));
        assertNotEquals(new BigDecimal(5.675).setScale(2, BigDecimal.ROUND_HALF_UP), calc.multiply(2.4, 3.1));
    }
}
