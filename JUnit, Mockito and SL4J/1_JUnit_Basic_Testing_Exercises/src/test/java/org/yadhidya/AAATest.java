package org.yadhidya;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AAATest {

    @Test
    public void testAddition(){
        Calculator cal=new Calculator();

        int result=cal.add(3,1);

        assertEquals(4,result);
    }
}
