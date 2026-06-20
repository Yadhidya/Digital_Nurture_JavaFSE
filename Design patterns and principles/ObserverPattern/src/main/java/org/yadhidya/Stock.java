package org.yadhidya;

public interface Stock {

    void register(Observer obs);
    void deregister(Observer obs);
    void notif(String stock);
}
