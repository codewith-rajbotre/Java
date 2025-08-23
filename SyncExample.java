class BankAccount {
    private int balance = 1000;

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " is withdrawing " + amount);
            balance -= amount;
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " - Not enough balance!");
        }
    }
}

public class SyncExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Thread t1 = new Thread(() -> account.withdraw(700), "Person-1");
        Thread t2 = new Thread(() -> account.withdraw(500), "Person-2");

        t1.start();
        t2.start();
    }
}
