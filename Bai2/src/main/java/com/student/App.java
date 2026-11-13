package com.student;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * BankSystem service refactored to comply with Google Java Style and structured observability.
 */
public final class App {
  private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
  private double balance;

  /**
   * Initializes a bank account with a non-negative opening balance.
   *
   * @param initialBalance starting balance
   */
  public App(double initialBalance) {
    if (initialBalance < 0) {
      LOGGER.error("Failed to initialize account with negative balance={}", initialBalance);
      throw new IllegalArgumentException("Initial balance cannot be negative");
    }
    this.balance = initialBalance;
    LOGGER.info("BankSystem account initialized with balance={}", this.balance);
  }

  /**
   * Entry point for BankSystem demonstration.
   *
   * @param args command line arguments
   */
  public static void main(String[] args) {
    LOGGER.info("BankSystem application started");
    App account = new App(1000.0);
    account.deposit("TXN-001", 500.0);
    account.withdraw("TXN-002", 200.0);
  }

  /**
   * Validates whether a transaction amount is strictly positive.
   *
   * @param amount transaction amount to check
   * @return true if amount is positive, false otherwise
   */
  public boolean isValidAmount(double amount) {
    if (amount <= 0) {
      LOGGER.warn("Rejected non-positive transaction amount={}", amount);
      return false;
    }
    return true;
  }

  /**
   * Deposits funds into the account.
   *
   * @param transactionId unique transaction reference
   * @param amount amount to deposit
   * @return updated balance
   */
  public double deposit(String transactionId, double amount) {
    if (!isValidAmount(amount)) {
      LOGGER.warn("Deposit aborted for transactionId={} due to invalid amount={}",
          transactionId, amount);
      return balance;
    }
    balance += amount;
    LOGGER.info("Deposit succeeded transactionId={} amount={} newBalance={}",
        transactionId, amount, balance);
    return balance;
  }

  /**
   * Withdraws funds from the account if sufficient balance exists.
   *
   * @param transactionId unique transaction reference
   * @param amount amount to withdraw
   * @return updated balance
   */
  public double withdraw(String transactionId, double amount) {
    if (!isValidAmount(amount)) {
      LOGGER.warn("Withdrawal aborted for transactionId={} due to invalid amount={}",
          transactionId, amount);
      return balance;
    }
    if (amount > balance) {
      LOGGER.error("Insufficient funds transactionId={} requested={} available={}",
          transactionId, amount, balance);
      throw new IllegalStateException("Insufficient funds");
    }
    balance -= amount;
    LOGGER.info("Withdrawal succeeded transactionId={} amount={} newBalance={}",
        transactionId, amount, balance);
    return balance;
  }

  /**
   * Returns the current account balance.
   *
   * @return current balance
   */
  public double getBalance() {
    return balance;
  }
}
