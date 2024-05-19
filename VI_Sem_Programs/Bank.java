class BankCustomer {
    private int id;
    private String name;
    private long acno;
    private double bal;
    private String email;
    private String phno;


    public BankCustomer(int id, String name, long acno, double bal, String email, String phno) {
        this.id = id;
        this.name = name;
        this.acno = acno;
        this.bal = bal;
        this.email = email;
        this.phno = phno;
    }


    public BankCustomer(int id, String name, long acno) {
        this(id, name, acno, 0.0, "N/A", "N/A");
    }

    public BankCustomer() {
        this(0, "N/A", 0, 0.0, "N/A", "N/A");
    }

    public void display() {
        System.out.println("Customer ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + acno);
        System.out.println("Balance: $" + bal);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phno);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            bal += amount;
            System.out.println("Deposited " + amount + ". New Balance: $" + bal);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= bal) {
            bal -= amount;
            System.out.println("Withdrew " + amount + ". New Balance: $" + bal);
        } else if (amount > bal) {
            System.out.println("Insufficient funds. Withdrawal failed.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
}

public class Bank{

    public static void main(String[] args) {
  
        BankCustomer customer1 = new BankCustomer(101, "Alice Smith", 123456789L, 1000.0, "alice@example.com", "123-456-7890");
        customer1.display();
        customer1.deposit(500.0);
        customer1.withdraw(200.0);
        System.out.println();

        BankCustomer customer2 = new BankCustomer(102, "Bob Johnson", 987654321L);
        customer2.display();
        customer2.deposit(300.0);
        customer2.withdraw(100.0);
        System.out.println();
        BankCustomer customer3 = new BankCustomer();
        customer3.display();
        customer3.deposit(150.0);
        customer3.withdraw(50.0);
    }
}