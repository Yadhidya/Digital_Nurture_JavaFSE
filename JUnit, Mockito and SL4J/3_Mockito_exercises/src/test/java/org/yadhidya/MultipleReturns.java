package org.yadhidya;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

public class MultipleReturns {

    @Test
    void multipleReturns(){

        ExternalApi api =
                mock(ExternalApi.class);

        when(api.getdata())

                .thenReturn("One")

                .thenReturn("Two")

                .thenReturn("Three");

        assertEquals("One",
                api.getdata());

        assertEquals("Two",
                api.getdata());

        assertEquals("Three",
                api.getdata());

    }
}
