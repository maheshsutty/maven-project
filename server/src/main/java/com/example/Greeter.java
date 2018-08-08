package com.example;

/**
 * @author MaheshSutty.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }
/**
 * @someone is a parameter
 */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
