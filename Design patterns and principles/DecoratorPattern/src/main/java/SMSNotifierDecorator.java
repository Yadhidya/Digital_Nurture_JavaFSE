public class SMSNotifierDecorator extends NotifierDecorator{

    SMSNotifierDecorator(Notifier notifier)
    {
        super(notifier);
    }
    @Override
    public void send(){

        super.send();
        System.out.println("SMS notification");
    }
}
