package org.yadhidya.Exercise4;

import static org.junit.jupiter.api.Assertions.*;

class NetworkServiceTest {
    @Test
    void networkTest(){

        NetworkClient client=
                mock(NetworkClient.class);

        when(client.connect())

                .thenReturn("Mock Connection");

        NetworkService service=
                new NetworkService(client);

        assertEquals(

                "Connected to Mock Connection",

                service.connectToServer()

        );

    }

}