package bank.kata;

public class Account {

    double balance;

    public Account() {
        this.balance = 0;
    }
    protected double getBalance() {
        return balance;
    }

    private void setBalance(double balance) {
        this.balance = balance;
    }

    public double updateBalance(double amount, String action){
        double updatedBalance = balance;

        switch (action.toLowerCase()) {
            case "credit" -> updatedBalance += amount;
            case "debit" -> {
                if (amount <= balance) updatedBalance -= amount;
            }
        }

        setBalance(updatedBalance);

        return updatedBalance;
    }

    public void printBalance(){
        System.out.println("Tu balance actual es " + getBalance());
    }
}