package com.thoughtworks.bootcamp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DepositTest {
    @Test
    void givenAmount_WhenDeposit_ThenShouldReturnAddedAmount() {
        Deposit depositAmount = new Deposit(100);
        assertEquals(500, depositAmount.execute());
    }
}
