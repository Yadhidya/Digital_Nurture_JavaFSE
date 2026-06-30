package org.yadhidya;

import junit.framework.TestCase;
import org.junit.Test;

public class CalculatorTest extends TestCase {

    Calculator cal=new Calculator();
    @Test
    public void testadd(){
       assertEquals(20,cal.add(10,10));
    }

    @Test
   public  void testSubtract(){

        assertEquals(2,
                cal.subtract(5,3));

    }

    @Test
  public  void testMultiply(){

        assertEquals(12,
                cal.multiply(3,4));

    }

    @Test
    public void testDivide(){

        assertEquals(5,
                cal.divide(10,2));

    }

}