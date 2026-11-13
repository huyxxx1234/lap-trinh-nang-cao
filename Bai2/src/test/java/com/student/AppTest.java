package com.student;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class AppTest {
  @Test
  void validatesTransactionAmount() {
    App account = new App(500.0);
    assertTrue(account.isValidAmount(100.0));
    assertFalse(account.isValidAmount(-1.0));
  }

  @Test
  void processesDepositAndWithdrawal() {
    App account = new App(500.0);
    assertEquals(750.0, account.deposit("TXN-100", 250.0), 0.001);
    assertEquals(600.0, account.withdraw("TXN-101", 150.0), 0.001);
    assertEquals(600.0, account.getBalance(), 0.001);
  }

  @Test
  void rejectsOverdraft() {
    App account = new App(100.0);
    assertThrows(IllegalStateException.class, () -> account.withdraw("TXN-102", 200.0));
  }
}
