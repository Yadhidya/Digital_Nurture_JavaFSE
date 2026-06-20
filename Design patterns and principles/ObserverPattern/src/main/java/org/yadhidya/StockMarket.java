package org.yadhidya;

import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Stock{
    List<Observer>  observers=new ArrayList<>();
    @Override
    public void register(Observer obs){
        observers.add(obs);
    }

    @Override
    public void deregister(Observer obs){
        observers.remove(obs);
    }

    @Override
    public void notif(String stock){
        for(Observer obs:observers)
            obs.update(stock);
    }



}
