package bank.kata;

public class Transaction {
    private String date;
    private OperationType operationType;
    private double amount;

    private double currentBalance;

    public Transaction(String date, OperationType operationType, double amount, double currentBalance) {
        this.date = date;
        this.operationType = operationType;
        this.amount = amount;
        this.currentBalance = currentBalance;
    }

    public String getDate() {
        return date;
    }

    public OperationType getOperationType() {
        return operationType;
    }

    public double getAmount() {
        return amount;
    }

    public double getCurrentBalance(){
        return currentBalance;
    }
}