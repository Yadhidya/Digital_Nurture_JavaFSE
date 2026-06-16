package org.yadhidya;

public class PdfDocFactory extends DocumentFactory{

    @Override
    Document createdocument(){
        return new PdfDocument();
    }
}
