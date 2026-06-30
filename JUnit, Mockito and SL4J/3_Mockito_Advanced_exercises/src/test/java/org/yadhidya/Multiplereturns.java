package org.yadhidya;

public class Multiplereturns {

    @Test
    void multipleReturns(){

        Repository repository=

                mock(Repository.class);

        when(repository.getData())

                .thenReturn("First")

                .thenReturn("Second")

                .thenReturn("Third");

        Service service=

                new Service(repository);

        assertEquals(

                "Processed First",

                service.processData()

        );

        assertEquals(

                "Processed Second",

                service.processData()

        );

        assertEquals(

                "Processed Third",

                service.processData()

        );

    }
}
