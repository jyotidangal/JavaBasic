///**
// * WAP in java  that takes input from the user in loop unless the user
// * enters exit .if a user enter exit, terminate the loop and display count
// * of input provided by user
// */
package com.firstassignment.loops;
import java.util.Scanner;
public class Qn36InputsCounter {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

int count =0;
        do{
            System.out.println(" If you want to exit enter (exit)");
            System.out.println(" Enter your input here:");
            String input=sc.nextLine();
            if(input.equalsIgnoreCase("exit")){//here we use IgnoreCase comparison
                break;
            }
            count++;
        }while(true);
System.out.println("No.of inputs are:"+count);

    }

}
