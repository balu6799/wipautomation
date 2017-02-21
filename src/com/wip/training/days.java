/**
 * 
 */
package com.wip.training;

/**
 * @author balu6
 *
 */
public class days {

  /**
   * @param args
   */
  public static void main(String[] args) {
    int x = 5, y = 10;
    int num = 10000;
    int days = num % 30;
    // int years = days % 365;
    int month = num / 30;
    System.out.println(num + " days = " + month + " Month and " + days + " days");
    System.out.println("value of a and b before swapping, x: " + x + " y: " + y);
    x = x + y; // now x is 5 and y is 10
    y = x - y;
    x = x - y; // now x is 10 and y is 5, numbers are swapped
    System.out.println("value of a and b after swapping, x: " + x + " y: " + y);

  }
}
