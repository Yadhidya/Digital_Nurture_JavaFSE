package org.yadhidya;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class EvenCheckerTest {

    EvenChecker checker=new EvenChecker();
    @ParameterizedTest
    @ValueSource(ints = {2,6,4})
    public void EvenCheckerTest(int num){
      assertTrue(checker.isEven(num));
    }

}