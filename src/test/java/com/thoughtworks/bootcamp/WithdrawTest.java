package com.thoughtworks.bootcamp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WithdrawTest {

    @Test
    void givenAmount_WhenWithdraw_ThenShouldReturnRemainingAmount() {
        Withdraw withdrawAmount = new Withdraw(100);
        assertEquals(300, withdrawAmount.execute());
    }
}
