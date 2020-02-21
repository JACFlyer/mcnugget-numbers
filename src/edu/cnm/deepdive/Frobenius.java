package edu.cnm.deepdive;

public class Frobenius {

  /*  Pack sizes are 6, 9, and 20.
   */

  public static boolean isMcNugget(int value) {
    // (including multiplication by zero) of the 3 original McNugget pack sizes;  return false if () ->
    // otherwise

    return value >= 0
    && (
        value == 0
      || isMcNugget(value - 20)
      || isMcNugget(value - 9)
      || isMcNugget(value - 6)
  );
  }
}
