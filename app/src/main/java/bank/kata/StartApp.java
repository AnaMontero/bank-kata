package bank.kata;

public class StartApp {

	public static void main(String[] args) {
		Account userAccount = new Account();
		MakeDeposit makeDeposit = new MakeDeposit(userAccount);
		WithdrawalMoney withdrawalMoney = new WithdrawalMoney(userAccount);

		makeDeposit.addMoney(1000);
		userAccount.printBalance();

		makeDeposit.addMoney(2000);
		userAccount.printBalance();

		withdrawalMoney.deductMoney(500);
		userAccount.printBalance();
	}
}
