import java.util.Scanner;

interface Account {
    void set(String name, String accountNumber, double balance);
    void display();
}

interface Person1 {
    void store();
    void disp();
}

class Customer implements Account, Person1 {
    private String name;
    private String accountNumber;
    private double balance;

    @Override
    public void set(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public void display() {
        System.out.println("Account Information:");
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }

    @Override
    public void store() {
        // Implementation for storing person information (not specified in the problem)
    }

    @Override
    public void disp() {
        // Implementation for displaying person information (not specified in the problem)
    }

    public void calculateInterest() {
        double interest = balance * 0.05; // Assuming 5% interest rate
        System.out.println("Interest: $" + interest);
    }
}

public class CustDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the customer name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the account number: ");
        String accountNumber = scanner.nextLine();

        System.out.print("Enter the account balance: ");
        double balance = scanner.nextDouble();

        Customer customer = new Customer();
        customer.set(name, accountNumber, balance);
        customer.display();
        customer.calculateInterest();
    }
}
