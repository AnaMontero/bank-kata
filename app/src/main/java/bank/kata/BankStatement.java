package bank.kata;

import java.text.MessageFormat;
import java.util.Collections;
import java.util.List;

public class BankStatement {

    public void printBankStatement(List<Transaction> transactions){
        Collections.reverse(transactions);

        String header = "date" + "\t\t" + "||" +
                " credit" + "\t" + "||" +
                " debit" + "\t" + "||" + " balance";
        System.out.println(header);

        var statementLine = "";
        for (var transaction : transactions) {
            var date = transaction.getDate() + "\t";
            var type = transaction.getOperationType();
            var amount = transaction.getAmount()  + "\t";
            var balance = transaction.getCurrentBalance();
            String amountCredited, amountDebited;
            if(type.name().equals("CREDIT")) {
                amountCredited = amount;
                amountDebited = "" + "\t\t\t";
            }
            else {
                amountCredited = "" + "\t\t\t";
                amountDebited = amount;
            }

            statementLine = MessageFormat.format("{0}|| {1}|| {2}|| {3}", date, amountCredited, amountDebited, balance + "\t");

            System.out.println(statementLine);
        }
    }
}