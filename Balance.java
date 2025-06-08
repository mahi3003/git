public class Balance {
    private double balance;

    
    public Balance() {
        this.balance = 0.0;
    }

   
    public Balance(double initialBalance) {
        this.balance = initialBalance;
    }

    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid or insufficient balance.");
        }
    }

   
    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    
    public static void main(String[] args) {
        Balance acc1 = new Balance(); 
        acc1.deposit(10000);
        acc1.withdraw(4000);
        acc1.displayBalance();

        System.out.println();

        Balance acc2 = new Balance(5000); 
        acc2.deposit(2000);
        acc2.withdraw(1000);
        acc2.displayBalance();
    }
}
