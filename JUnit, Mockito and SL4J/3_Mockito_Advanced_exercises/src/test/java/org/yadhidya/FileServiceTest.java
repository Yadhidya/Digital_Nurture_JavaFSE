package org.yadhidya;

import org.junit.jupiter.api.Test;
import org.yadhidya.Exercise3.FileReader;
import org.yadhidya.Exercise3.FileService;
import org.yadhidya.Exercise3.FileWriter;

import static org.junit.jupiter.api.Assertions.*;

class FileServiceTest {
    @Test
    void testFileService(){

        FileReader reader=
                mock(FileReader.class);

        FileWriter writer=
                mock(FileWriter.class);

        when(reader.read())
                .thenReturn("Mock File Content");

        FileService service=
                new FileService(reader,writer);

        assertEquals(

                "Processed Mock File Content",

                service.processFile()

        );

    }
}