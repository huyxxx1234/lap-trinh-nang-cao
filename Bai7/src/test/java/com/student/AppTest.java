package com.student;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class AppTest {
  @Test
  void applicationIsReady() {
    assertTrue(new App().isReady());
  }
}
