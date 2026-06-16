public class Main {
    public static void main(String[] args) {
        PaymentProcessor paypal=new PaypalAdapter();
        paypal.processPayment(500);
        PaymentProcessor stripe=new StripeAdapter();
        stripe.processPayment(300);
    }
}
