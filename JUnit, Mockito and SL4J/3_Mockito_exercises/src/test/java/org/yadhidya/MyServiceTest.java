package org.yadhidya;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class MyServiceTest {


    @Test
    void testExternalApi(){
        ExternalApi mockApi=mock(ExternalApi.class);

        when(mockApi.getdata())
                .thenReturn("Mock Data");

        MyService service=new MyService(mockApi);
        String result=service.fetchData();
        assertEquals("Mock Data",result);
    }

}