package bank.kata;

public class TransactionResults {

    protected static String checkTransactionResult(int transactionResult) {
        String operationResult = "Transacción exitosa";

        if (transactionResult == 0) operationResult = "No se ha podido realizar la transacción.";

        return operationResult;
    }

    public static void printTransactionResult(int transactionResult){
        System.out.println(checkTransactionResult(transactionResult));
    }
}
