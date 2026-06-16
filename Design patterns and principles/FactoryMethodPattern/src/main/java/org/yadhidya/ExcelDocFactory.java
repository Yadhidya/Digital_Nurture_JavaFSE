package org.yadhidya;

public class ExcelDocFactory  extends DocumentFactory{

    @Override
    Document createdocument(){
        return new ExcelDocument();
    }
}
