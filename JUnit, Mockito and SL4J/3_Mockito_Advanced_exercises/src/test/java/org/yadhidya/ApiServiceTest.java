package org.yadhidya;

import org.junit.jupiter.api.Test;
import org.yadhidya.Exercise2.ApiService;
import org.yadhidya.Exercise2.RestClient;

import static org.junit.jupiter.api.Assertions.*;

class ApiServiceTest {

    @Test
    void testServiceWithMockRestClient(){

        RestClient client =
                mock(RestClient.class);

        when(client.getResponse())
                .thenReturn("Mock Response");

        ApiService service =
                new ApiService(client);

        assertEquals(
                "Fetched Mock Response",
                service.fetchData()
        );

    }
}