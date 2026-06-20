package org.yadhidya;

public class WebApp implements Observer{

    @Override
    public void update(String stock){
        System.out.println("Stock updated :"+stock);
    }
}
