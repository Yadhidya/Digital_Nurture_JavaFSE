package org.yadhidya;

public class PaymentContext {
    PaymentStrategy ps;
    PaymentContext(PaymentStrategy ps)
    {
        this.ps=ps;
    }

    void pay(){
        ps.pay();
    }
}
