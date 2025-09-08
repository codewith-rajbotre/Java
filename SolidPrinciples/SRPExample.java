// File: SRPExample.java
class UserService {
    public void addUser(String name) {
        System.out.println("User added: " + name);
    }
}

class ReportService {
    public void generateReport(String name) {
        System.out.println("Report generated for: " + name);
    }
}

public class SRPExample {
    public static void main(String[] args) {
        UserService userService = new UserService();
        userService.addUser("Jara");

        ReportService reportService = new ReportService();
        reportService.generateReport("Jara");
    }
}
