package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

 /**
  * This is a comment of function.
  * @param someone this is someone the name of a person.
  * @return someone this is someone greeting string.
  */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}

