package com.thoughtworks.bootcamp;

public class Bank {
    public static void main(String[] args) {
        Withdraw withdrawAmount = new Withdraw(100);
        System.out.println("Withdraw Amount=" + withdrawAmount.execute());
    }
}
