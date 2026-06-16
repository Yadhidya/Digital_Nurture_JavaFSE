public class StripeAdapter implements PaymentProcessor{
    Stripe stripe;

    StripeAdapter(){
        this.stripe=new Stripe();
    }
    public void processPayment(int amount){
stripe.makepayment(amount);
    }
}
