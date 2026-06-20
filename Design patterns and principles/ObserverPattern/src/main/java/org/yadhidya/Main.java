package org.yadhidya;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Stock amzon=new StockMarket();
        amzon.register(new MobileApp());
        amzon.register((new WebApp()));
        amzon.notif("50k");
    }
}