package org.yadhidya;

import org.junit.jupiter.api.Test;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

public class TestArgument {

    @Test
    void testArgumentMatching() {

        ExternalApi mockApi =
                mock(ExternalApi.class);

        when(mockApi.findUser(anyInt()))
                .thenReturn("John");

        MyService service =
                new MyService(mockApi);

        service.getUser(100);

        verify(mockApi).findUser(anyInt());

    }
}
