package org.yadhidya;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderedTests {

    @Test
    @Order(2)
    public void second(){
        System.out.println("second");
    }

    @Test
    @Order(1)
    public void First(){
        System.out.println("First");
    }

    @Test
    @Order(3)
    public void third(){
        System.out.println("third");
    }

}
