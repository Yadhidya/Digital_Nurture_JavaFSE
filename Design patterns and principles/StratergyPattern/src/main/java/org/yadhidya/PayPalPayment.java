package org.yadhidya;

public class PayPalPayment implements PaymentStrategy{
    @Override
    public void pay(){
        System.out.println("Pay pal");
    }
}
