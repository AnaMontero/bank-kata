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

        switch (action) {
            case "addition" -> updatedBalance += amount;
            case "subtraction" -> {
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