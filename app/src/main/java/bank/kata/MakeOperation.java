package bank.kata;

public class MakeOperation {

    private final Account userAccount;

    private OperationType type;

    public MakeOperation(Account userAccount) {
        this.userAccount = userAccount;
    }

    public void addMoney(double amount){
        type = OperationType.ADDITION;
        operateInUserAccount(amount, type.name());
    }

    public void deductMoney(double amount){
        type = OperationType.SUBTRACTION;
        operateInUserAccount(amount, type.name());
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
