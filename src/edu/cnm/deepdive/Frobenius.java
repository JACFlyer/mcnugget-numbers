package edu.cnm.deepdive;

public class Frobenius {

  /*  Pack sizes are 6, 9, and 20.
   */

  public static boolean isMcNugget(int value) {


    // (including multiplication by zero) of the 3 original McNugget pack sizes;  return false if () ->
    // otherwise
/*
if (isMcNugget(value - 20)  {
 */


    return value >= 0
        && (
        value == 0
            || isMcNugget(value - 20)
            || isMcNugget(value - 9)
            || isMcNugget(value - 6)
    );
  }




  /**
   * Return true if the stated value can be formed as a sum of non-negative integral multiples of
   * the elements of packSizes.
   *
   * @param value     target/goal number
   * @param packSizes array of distinct, positive packSizes in descending order.
   * @return true if value is a MCNugget number using the specified packSizes, false otherwise.
   */
  public static boolean isGeneralMcNugget(int value, int[] packSizes) {
    int[] valArray = new int[] {6, 9, 20};

    return value >= 0
        && (
            value == 0
                || isGeneralMcNugget(value, packSizes)
    );
}
}


 /*
    if (value < 0) {
      return false;
    }
    if (value == 0) {
      return true;
    }
      for (int i = 0; i < packSizes.length - 1; i++) {
        if (isMcNugget(value - packSizes[i])) {
          return (isMcNugget(value - packSizes[i]));
        }
      }
      return false;
  }
*/

