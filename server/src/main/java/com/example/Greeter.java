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

  public String greet(String someone) {
    return String.format("Hello, %s!", someone);
  }
}
