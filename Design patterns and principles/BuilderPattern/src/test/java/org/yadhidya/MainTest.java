package org.yadhidya;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testbuilder(){
        Computer c1=new Computer.Builder()
                .setCpu("Intel i5")
                .setRAM(16)
                .setstorage(512)
                .build();
        c1.details();
    }

}