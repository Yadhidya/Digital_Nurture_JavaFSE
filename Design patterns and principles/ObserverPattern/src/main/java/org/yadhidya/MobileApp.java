package org.yadhidya;

public class MobileApp implements Observer{

    @Override
    public void update(String stock){
        System.out.println("Stock updated :"+stock);
    }
}
