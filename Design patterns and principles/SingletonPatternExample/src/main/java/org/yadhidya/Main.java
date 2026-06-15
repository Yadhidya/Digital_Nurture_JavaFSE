package org.yadhidya;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Logger log1=Logger.getInstance();
        System.out.println(log1.hashCode());
        Logger log2=Logger.getInstance();
        System.out.println(log2.hashCode());
    }

}