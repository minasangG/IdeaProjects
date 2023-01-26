package Exceptions;

import java.io.IOException;

public class Account {
    private float balance;
    private float exactUserBalance;

    public void deposit(float value) throws IOException {

//        System.out.println();
        if (value <= 0)
            throw new IOException();
        System.out.println("Please deposit at least 500");
    }

//    public float withdraw(float value) throws InsufficientFundsException, AccountException {
//        if (value > balance) {
//            var accountException = new AccountException(new InsufficientFundsException());
//            throw accountException;
//        }
//        return value;
//    public float setBalance(float value) {
//        this.exactUserBalance = exactUserBalance;
//        return value;
//    }
//
//    public float getBalance(float value) {
//        return exactUserBalance;

}
