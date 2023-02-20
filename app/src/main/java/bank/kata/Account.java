package bank.kata;

public class Account {

    double balance;

    public Account() {
        this.balance = 0;
    }
    private double getBalance() {
        return balance;
    }

    private void setBalance(double balance) {
        this.balance = balance;
    }

    public double checkBalance() {
        return getBalance();
    }

    public double updateBalance(double amount, String action){
        double updatedBalance = balance;

        switch (action) {
            case "suma" -> updatedBalance += amount;
            case "resta" -> updatedBalance -= amount;
        }

        setBalance(updatedBalance);
        return updatedBalance;
    }

    public void printBalance(){
        System.out.println("Tu balance actual es " + getBalance());
    }
}