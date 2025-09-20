/**
 * WAP to check if a person is eligible to cast a vote or not .
 */
package com.task1.conditionalstatement;
import java.util.Scanner;
public class Qn4VoterEligibilityCheck {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);//Object created
        boolean status= true;
        while(status) {
            System.out.println("*************************************");
            System.out.println("1 Do you want to check you are eligible for voting?");
            System.out.println("2 Exit");
            System.out.println("*************************************");
            System.out.println("Enter your Choice here:");
            int choice= input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter your age:");
                    int age = input.nextInt();
                   if(age < 0 || age > 120){
                       System.out.println(" Enter the valid age");
                   }
                   else if(age>=18)
                   {
                       System.out.println(" Congratulations, you are eligible  to cast a vote.");
                   }
                   else
                   {
                       int eligibleAge=18;
                       System.out.println(" Sorry! you are not eligible to cast a vote.");
                       System.out.println("You need to wait "+(eligibleAge-age) +" years");
                   }
                    break;
                case 2:
                    status= false;
                    break;
                default:
                    System.out.println(" Please make the correct choice");
            }
        }

    }
}
