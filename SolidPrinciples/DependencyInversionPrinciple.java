
interface Notifier {
    void send(String to, String message);
}

class EmailNotifier implements Notifier {
    @Override
    public void send(String to, String message) {
        System.out.println("Email sent to " + to + ": " + message);
    }
}


class SmsNotifier implements Notifier {
    @Override
    public void send(String to, String message) {
        System.out.println("SMS sent to " + to + ": " + message);
    }
}


class NotificationService {
    private final Notifier notifier;  

    public NotificationService(Notifier notifier) {
        this.notifier = notifier;
    }

    public void notifyUser(String contact, String message) {
        notifier.send(contact, message);
    }
}

public class DependencyInversionPrinciple {
    public static void main(String[] args) {

       
        Notifier email = new EmailNotifier();
        NotificationService emailService = new NotificationService(email);
        emailService.notifyUser("jara@example.com", "Hello Jara! This is an Email Notification");

        
        Notifier sms = new SmsNotifier();
        NotificationService smsService = new NotificationService(sms);
        smsService.notifyUser("+911234567890", "Hello Jara! This is an SMS Notification");
    }
}
