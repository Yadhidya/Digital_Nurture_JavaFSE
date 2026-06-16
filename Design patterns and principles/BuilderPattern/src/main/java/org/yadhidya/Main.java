package org.yadhidya;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Computer c1=new Computer.Builder()
                .setCpu("Intel i5")
                .setRAM(16)
                .setstorage(512)
                .build();
        c1.details();
    }
}