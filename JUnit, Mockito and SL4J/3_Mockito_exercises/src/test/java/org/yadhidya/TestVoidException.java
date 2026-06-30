package org.yadhidya;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

public class TestVoidException {

    @Test
    void testVoidException(){

        ExternalApi api =
                mock(ExternalApi.class);

        doThrow(
                new RuntimeException("Delete Failed"))

                .when(api)

                .delete();

        assertThrows(

                RuntimeException.class,

                ()->{

                    api.delete();

                }

        );

    }
}
