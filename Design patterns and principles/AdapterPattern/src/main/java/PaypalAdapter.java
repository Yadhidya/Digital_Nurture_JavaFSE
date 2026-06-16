public class PaypalAdapter implements PaymentProcessor{

    Paypal paypal;
    PaypalAdapter(){
        this.paypal=new Paypal();
    }
    public void processPayment(int amount){
        paypal.pay(amount);
    }
}
