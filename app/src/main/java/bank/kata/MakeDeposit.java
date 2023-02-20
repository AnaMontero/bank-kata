package bank.kata;

public class MakeDeposit {

    Account userAccount;

    public MakeDeposit(Account userAccount) {
        this.userAccount = userAccount;
    }

    public void addMoney(double amount){
        var addMoneyResult = userAccount.updateBalance(amount, "suma");
        var transactionResult = 0;

        if(addMoneyResult == userAccount.checkBalance()){
            transactionResult = 1;
        }

        TransactionResults.printTransactionResult(transactionResult);
    }
}
