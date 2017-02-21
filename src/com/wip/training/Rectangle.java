package com.wip.training;

public class Rectangle {
  public static int count = 0;
  private int length = 5;
  private int width = 6;
  public Rectangle(int len, int wid) {
  
        length = len;
        width = wid;
        count++;
  }

   public int area() {
    return length * width;
  }

  int perimeter() {
    return 2 * (length + width);
  }

}
