/**
 * 
 */
package com.wip.training;

/**
 * @author balu6
 *
 */
public class Assign3 {

  /**
   * @param args
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int x, y, z, i, j;

    {
      for (i = 5; i >= 1; i--) {
        for (j = 1; j <= i; j++) {
          System.out.print("*");
        }
        System.out.println();

      }
    }
    StringBuffer sb = new StringBuffer();
    for (int k = 1; k <= 100; k++) {
      sb.append(k);
      if (k < 100)
        sb.append(',');
      else
        sb.append(';');
    }

    System.out.println(sb);
    int n = 6799;
    int sum = 0;
    while (n != 0) {
      sum = sum + (n % 10);
      n = n / 10;
    }
    System.out.println(sum);

  }

}
