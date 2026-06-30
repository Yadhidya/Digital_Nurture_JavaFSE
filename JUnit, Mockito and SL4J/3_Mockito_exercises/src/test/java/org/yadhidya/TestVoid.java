package org.yadhidya;
import org.junit.jupiter.api.Test;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

public class TestVoid {
    @Test
    void testVoidMethod() {

        ExternalApi mockApi =
                mock(ExternalApi.class);

        doNothing()
                .when(mockApi)
                .send();

        MyService service =
                new MyService(mockApi);

        service.execute();

        verify(mockApi).send();

    }
}
