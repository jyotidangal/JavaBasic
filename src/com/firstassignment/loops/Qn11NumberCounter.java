/**
 * Write a program to enter the numbers till the user wants and at the
 * end it should display the  count of positive, negative and zeros entered.
 */
package com.firstassignment.loops;
import java.util.Scanner;
public class Qn11NumberCounter {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      char ch;
      int positiveCounter = 0, negativeCounter = 0, zeroCounter = 0;
      do {
          System.out.println("Enter a number:");
          int number = sc.nextInt();

          if (number > 0) {
              positiveCounter++;
          } else if (number <0) {
              negativeCounter++;
          } else {
              zeroCounter++;
          }
          System.out.println("Do you want to continue(y/n)?");
          sc.nextLine();
          String choice = sc.nextLine();
          ch = choice.charAt(0);
      }while(ch=='y'||ch=='Y');
      System.out.println("count of positive numbers: "+positiveCounter+" \n" +
              "count of negative numbers: "+negativeCounter+"\n"+
              "count of zero's: "+zeroCounter);
    }
}
