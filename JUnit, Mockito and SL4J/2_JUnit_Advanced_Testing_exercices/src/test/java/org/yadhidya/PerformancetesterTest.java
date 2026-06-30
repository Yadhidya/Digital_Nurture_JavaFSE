package org.yadhidya;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class PerformancetesterTest {

    Performancetester tester=new Performancetester();

    @Test
    public void timeoutTest(){
        assertTimeout(Duration.ofSeconds(3),()->{
            tester.perform();
        });
    }
}