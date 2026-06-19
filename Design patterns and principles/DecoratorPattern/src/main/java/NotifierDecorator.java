public abstract class NotifierDecorator implements Notifier{

    Notifier notifier;

    NotifierDecorator(Notifier notifier)
    {
        this.notifier=notifier;
    }

    @Override
    public void send(){
        notifier.send();
    }
}
