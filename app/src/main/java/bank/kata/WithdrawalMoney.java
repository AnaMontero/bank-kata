package bank.kata;

public class WithdrawalMoney {

    Account userAccount;

    public WithdrawalMoney(Account userAccount) {
        this.userAccount = userAccount;
    }

    public void deductMoney(double amount){
        var addMoneyResult = userAccount.updateBalance(amount, "resta");
        var transactionResult = 0;

        if(addMoneyResult == userAccount.checkBalance()){
            transactionResult = 1;
        }

        TransactionResults.printTransactionResult(transactionResult);
    }
}
