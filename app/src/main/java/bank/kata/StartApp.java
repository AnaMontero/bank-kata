package bank.kata;

import java.util.ArrayList;
import java.util.List;

import static bank.kata.OperationType.CREDIT;
import static bank.kata.OperationType.DEBIT;

public class StartApp {

	public static void main(String[] args) {
		Account userAccount = new Account();
		MakeOperation makeOperation = new MakeOperation(userAccount);
		List<Transaction> transactions = new ArrayList<>();
		BankStatement bankStatement = new BankStatement();

		makeOperation.addMoney(1000);
		userAccount.printBalance();
		var firstTransaction = new Transaction("10/01/2012", CREDIT, 1000, userAccount.getBalance());
		transactions.add(firstTransaction);

		makeOperation.addMoney(2000);
		userAccount.printBalance();
		var secondTransaction = new Transaction("13/01/2012", CREDIT, 2000, userAccount.getBalance());
		transactions.add(secondTransaction);

		makeOperation.deductMoney(500);
		userAccount.printBalance();
		var thirdTransaction = new Transaction("14/01/2012", DEBIT, 500, userAccount.getBalance());
		transactions.add(thirdTransaction);

		bankStatement.printBankStatement(transactions);
	}
}
