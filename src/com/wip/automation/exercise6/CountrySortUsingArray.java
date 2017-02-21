package com.wip.automation.exercise6;

import java.util.Arrays;

public class CountrySortUsingArray {

  public static void main(String[] args) {
    String[] countries = new String[] {"India", "Germany", "United Kingdom", "Netherlands"};
    Arrays.sort(countries);
    System.out.println("Sorted country names: ");
    for (int i = 0; i < countries.length; i++) {
      System.out.println(countries[i]);
    }

  }

}
