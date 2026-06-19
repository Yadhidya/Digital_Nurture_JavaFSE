public class SlackNotifierDecorator extends NotifierDecorator{

    SlackNotifierDecorator(Notifier notifier)
    {
        super(notifier);
    }

    @Override
    public void  send(){
        super.send();
        System.out.println("Slack Notification");
    }
}
