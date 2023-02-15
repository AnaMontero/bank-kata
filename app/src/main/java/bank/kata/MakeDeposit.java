package bank.kata;

public class MakeDeposit {
    int balance;

    public String addMoney(int amount){
        String operationResult = "";
        balance += amount;
        operationResult = "Transacción exitosa";
        return operationResult;
    }
}
