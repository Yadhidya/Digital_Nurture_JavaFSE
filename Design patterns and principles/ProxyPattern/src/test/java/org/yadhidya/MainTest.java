package org.yadhidya;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void proxytest(){

        Image img1=new ProxyImage();
        img1.display("insta");
        Image img2=new ProxyImage();
        img1.display("fb");
        Image img3=new ProxyImage();
        img1.display("insta");
    }

}