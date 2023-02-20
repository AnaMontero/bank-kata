package bank.kata;

public class MakeOperation {

    private final Account userAccount;

    private String operationType;

    public MakeOperation(Account userAccount) {
        this.userAccount = userAccount;
    }

    public void addMoney(double amount){
        operationType = "addition";
        operateInUserAccount(amount, operationType);
    }

    public void deductMoney(double amount){
        operationType = "subtraction";
        operateInUserAccount(amount, operationType);
    }

    private void operateInUserAccount(double amount, String operationType) {
        var previousAccountBalance = userAccount.getBalance();
        var newAccountBalance = userAccount.updateBalance(amount, operationType);

        int transactionResult = checkOperationResult(previousAccountBalance, newAccountBalance);

        TransactionResults.printTransactionResult(transactionResult);
    }

    private int checkOperationResult(double previousAccountBalance, double newAccountBalance) {
        var transactionResult = 0;

        if(previousAccountBalance != newAccountBalance){
            transactionResult = 1;
        }
        return transactionResult;
    }
}
