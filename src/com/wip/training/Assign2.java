package com.wip.training;

/**
 * @author balu6
 *
 */
public class Assign2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int sum = 0;
		int n = 100;
		int sumeven= 0;
		while (n>0){
			sum = sum + n;
			if (n%2 == 0){
				sumeven = sumeven + n;
			}
			n--;
			}
		System.out.println("The sum of 1-100 natural numbers is "+ sum);
		System.out.println("The sum of Even from 1-100 natural numbers is "+ sumeven);
		{
			int x = 20,y =30, j = 2, i= 1;
			int remainder =  x % y;
			int check = (2*x + y);
			int value = (x+y) * (x+y) ;
			System.out.println("The sum  of (x+y) * (x+y) = " + value);
			System.out.println("Find value of x%y =" + remainder);
			System.out.println("Find value of 2x+y = " + check);
	        while(i <= 10){
		    System.out.print( j + "  *  " + i + "  =  "  + j*i + "\n");
			        i++;
			    }
		}
	}
}

