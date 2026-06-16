package org.yadhidya;

public class WordDocFactory  extends DocumentFactory{

    @Override
    Document createdocument(){
        return new WordDocument();
    }

}
