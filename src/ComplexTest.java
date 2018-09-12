import org.junit.jupiter.api.Test;

import static org.codehaus.groovy.runtime.DefaultGroovyMethods.round;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class ComplexTest {

    @Test
    public void simlpeAdditionTest(){
        Complex c1 = new Complex(1.5, 2.5f);
        Complex c2 = new Complex(0.5, 1.1);
        assertEquals(c1.add(c2).getReal(), 2);
        assertEquals(c1.add(c2).getImaginary(),3.6);
    }

    @Test
    public void negativeNumbersAddition(){
        Complex c1 = new Complex(-1.1, -3.3);
        Complex c2 = new Complex(-4.4, 0);
        assertEquals(c1.add(c2).getReal(), -5.5);
        assertEquals(c1.add(c2).getImaginary(), -3.3);
    }

    @Test
    public void positiveNumbersSubtraction(){
        Complex c1 = new Complex(5.5, 6.6);
        Complex c2 = new Complex(1.1, 3.5);
        assertEquals(round(c1.subtract(c2).getReal(),4), 4.4);
        assertEquals(round(c2.subtract(c1).getReal(),4), -4.4);
        assertEquals(round(c1.subtract(c2).getImaginary(),4), 3.1);
        assertEquals(round(c2.subtract(c1).getImaginary(),4), -3.1);
    }

    @Test
    public void negativeNumberSubtraction(){
        Complex c1 = new Complex(-1.444, -6.642);
        Complex c2 = new Complex(-1.142, -3.562);
        assertEquals(round(c1.subtract(c2).getReal(),4), -0.302);
        assertEquals(round(c2.subtract(c1).getReal(),4), 0.302);
        assertEquals(round(c1.subtract(c2).getImaginary(),4), -3.08);
        assertEquals(round(c2.subtract(c1).getImaginary(),4), 3.08);
    }

    @Test
    public void multiplication(){
        Complex c1 = new Complex(1.0,3.0);
        Complex c2 = new Complex(-1,-5);
        assertEquals(round(c1.multiply(c2).getReal(),4), 14.0);
        assertEquals(round(c1.multiply(c2).getImaginary(),4), -8.0);
    }

}