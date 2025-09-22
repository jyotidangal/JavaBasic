package com.firstassignment.loops;
import java.util.Scanner;
public class Qn31WhileLoop {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positiveCount=0;
        while(true){
            System.out.println("Negative integer entry will terminate the loop");
            System.out.println("Enter an integer :");
            int number=sc.nextInt();

            if(number < 0){
                break;
            }
            positiveCount++;
        }
        System.out.print("Count of positive integers is: "+positiveCount);
    }
}
