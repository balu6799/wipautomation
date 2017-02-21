/**
 * 
 */
package com.wip.training;

/**
 * @author balu6
 *
 */
public class Multiply {

  /**
   * @param args
   */
  public static void main(String[] args) {
    int x = 20, y = 30, j = 2, i = 1;
    int remainder = x % y;
    int check = (2 * x + y);
    int value = (x + y) * (x + y);
    System.out.println("The sum  of (x+y) * (x+y) = " + value);
    System.out.println("Find value of x%y =" + remainder);
    System.out.println("Find value of 2x+y = " + check);
    while (i <= 10) {
      System.out.print(j + "  *  " + i + "  =  " + j * i + "\n");
      i++;
    }
  }
}
