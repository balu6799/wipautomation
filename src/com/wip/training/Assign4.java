/**
 * 
 */
package com.wip.training;

/**
 * @author balu6
 *
 */
public class Assign4 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] numbers = new int[] { 10, 20, 30, 40, 50, 60, 70 };

        int minValue = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i];
            }

        }

        System.out.println("Minimum Value of numbers array " + minValue);

        int maxValue = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
            }
        }
        System.out.println("Maximum Value of numbers array " + maxValue);

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];

        }

        System.out.println("The sum of numbers array " + sum);

        int[] numArrayCopy = new int[numbers.length];

        System.out.print("Copy of the array ");
        for (int x = 0; x < numbers.length; x++) {

            numArrayCopy[x] = numbers[x];
            System.out.print(numArrayCopy[x] + ",");

        }

        // Copy to new array from the end
        int[] revArrayCopy = new int[numbers.length];

        System.out.print("\nReverse copy of numbers array ");
        for (int x = numbers.length - 1; x >= 0; x--) {

            revArrayCopy[x] = numbers[x];
            System.out.print(numArrayCopy[x] + ",");
        }

    }

}
