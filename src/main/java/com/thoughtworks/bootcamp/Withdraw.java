package com.thoughtworks.bootcamp;

public class Withdraw implements Transaction {
    private int withdrawAmount;

    Withdraw(int withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }

    @Override
    public int execute() {
        return actualAmount - withdrawAmount;
    }
}
