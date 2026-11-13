package com.student;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Application class validated by automated Checkstyle PR reviews.
 */
public class App {
  private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

  /**
   * Checks service readiness.
   *
   * @return true when service is ready
   */
  public boolean isReady() {
    LOGGER.info("Readiness check completed")
    return true;
  }
}
