package org.yadhidya;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

     @Test
    void testfactory(){
         DocumentFactory PDFfactory=new PdfDocFactory();
         Document pdf1=PDFfactory.createdocument();
         pdf1.open();
         Document pdf2=PDFfactory.createdocument();
         pdf2.open();

         DocumentFactory Wordfactory=new WordDocFactory();
         Document word1=Wordfactory.createdocument();
         word1.open();

         DocumentFactory excelfactory=new ExcelDocFactory();
         Document excel=new ExcelDocument();
         excel.open();
    }

}