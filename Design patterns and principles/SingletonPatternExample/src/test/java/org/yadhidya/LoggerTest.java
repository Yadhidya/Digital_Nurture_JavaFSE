package org.yadhidya;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoggerTest {

    @Test
    void testsingleton(){
        Logger log1=Logger.getInstance();
        Logger log2=Logger.getInstance();
        //assertSame(log1,log2);
        if(log1==log2)
        {
            System.out.println("Passed");
        }
        else
        {
            System.out.println("Failed");
        }
    }

}