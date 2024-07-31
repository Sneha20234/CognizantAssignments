 interface Notifier {
    void send(String message);
}

 class EmailNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Sending email: " + message);
    }
}

 abstract class NotifierDecorator implements Notifier {
    protected Notifier wrappedNotifier;

    public NotifierDecorator(Notifier notifier) {
        this.wrappedNotifier = notifier;
    }

    @Override
    public void send(String message) {
        wrappedNotifier.send(message);
    }
}

 class SMSNotifierDecorator extends NotifierDecorator {
    public SMSNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        sendSMS(message);
    }

    private void sendSMS(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

 class SlackNotifierDecorator extends NotifierDecorator {
    public SlackNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        sendSlack(message);
    }

    private void sendSlack(String message) {
        System.out.println("Sending Slack message: " + message);
    }
}

public class Decorator_Pattern {
    public static void main(String[] args) {
        Notifier emailNotifier = new EmailNotifier();
        Notifier emailAndSMSNotifier = new SMSNotifierDecorator(emailNotifier);
        Notifier emailSMSAndSlackNotifier = new SlackNotifierDecorator(emailAndSMSNotifier);

        emailNotifier.send("Hello via Email!");
        System.out.println();

        emailAndSMSNotifier.send("Hello via Email and SMS!");
        System.out.println();

        emailSMSAndSlackNotifier.send("Hello via Email, SMS, and Slack!");
    }
}
