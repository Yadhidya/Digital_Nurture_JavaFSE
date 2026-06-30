package org.yadhidya;

import org.junit.jupiter.api.Test;
import org.yadhidya.Exercise1.Repository;
import org.yadhidya.Exercise1.Service;

import static org.junit.jupiter.api.Assertions.*;

class ServiceTest {

    @Test
    void testServiceWithMockRepository() {

        Repository mockRepository =
                mock(Repository.class);

        when(mockRepository.getData())
                .thenReturn("Mock Data");

        Service service =
                new Service(mockRepository);

        String result =
                service.processData();

        assertEquals(
                "Processed Mock Data",
                result
        );

    }

}