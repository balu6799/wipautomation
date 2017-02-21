/**
 * 
 */
package com.wip.training;

/**
 * @author balu6
 *
 */
public class Numbertext {
  public static void main(String[] args) {
    String[] digits = new String[] {"Zero", "One", "Two", "Three"};
    int num = 123456;
    while (num > 0) {
      int digit = num % 10;
      System.out.println(num % 10);
      num = num / 10;
    }

  }
}
