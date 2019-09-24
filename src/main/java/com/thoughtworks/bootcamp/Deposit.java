package com.thoughtworks.bootcamp;

public class Deposit implements Transaction {


    private int depositAmount;

    Deposit(int depositAmount) {
        this.depositAmount = depositAmount;
    }

    @Override
    public int execute() {
        return actualAmount + depositAmount;
    }


}
