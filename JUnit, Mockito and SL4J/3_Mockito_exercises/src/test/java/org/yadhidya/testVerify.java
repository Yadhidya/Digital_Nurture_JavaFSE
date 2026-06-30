package org.yadhidya;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class testVerify {

    @Test
    void testVerifyInteraction() {

        ExternalApi mockApi =
                mock(ExternalApi.class);

        when(mockApi.getdata())
                .thenReturn("Mock Data");

        MyService service =
                new MyService(mockApi);

        service.fetchData();

        verify(mockApi).getdata();
    }
}
