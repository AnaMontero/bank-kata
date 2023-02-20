package bank.kata;

public class StartApp {

	public static void main(String[] args) {
		MakeDeposit makeDeposit = new MakeDeposit();


		var result1 = makeDeposit.addMoney(20);
		var result2 = makeDeposit.addMoney(50);

		System.out.println(result1);
		System.out.println(result2);
	}
}
