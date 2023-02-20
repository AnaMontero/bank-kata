package bank.kata;

public class StartApp {

	public static void main(String[] args) {
		Account userAccount = new Account();
		MakeDeposit makeDeposit = new MakeDeposit(userAccount);

		makeDeposit.addMoney(20);
		userAccount.printBalance();

		makeDeposit.addMoney(50);
		userAccount.printBalance();
	}
}
