package org.yadhidya;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExceptionThrowerTest {

    ExceptionThrower obj=new ExceptionThrower();

    @Test
    public void exceptiontest(){
        assertThrows(ArithmeticException.class,()->{
            obj.throwException();
        });
    }

}