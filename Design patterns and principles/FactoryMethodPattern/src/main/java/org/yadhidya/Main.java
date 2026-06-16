package org.yadhidya;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
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