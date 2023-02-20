package bank.kata;

public class StartApp {

	public static void main(String[] args) {
		Account userAccount = new Account();
		MakeOperation makeOperation = new MakeOperation(userAccount);

		makeOperation.addMoney(1000);
		userAccount.printBalance();

		makeOperation.addMoney(2000);
		userAccount.printBalance();

		makeOperation.deductMoney(500);
		userAccount.printBalance();
	}
}
