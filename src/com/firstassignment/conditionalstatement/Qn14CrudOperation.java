/**
 * Show 5 options to user
 * CREATE , READ , UPDATE , DELETE
 * Let user choose any one of the option
 * Under every option ask user the number of times
 * Print the option name to the number of times that user enters.
 * If a user enters the option which is not in the option list display TRY AGAIN !!
 */
package com.firstassignment.conditionalstatement;
import java.util.Scanner;
public class Qn14CrudOperation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        boolean status= true;
        while(status){
            System.out.println("******************************");
            System.out.println("1 Create user");
            System.out.println("2 Read user details");
            System.out.println("3 Update user details");
            System.out.println("4 Delete user");
            System.out.println("5 Exit");
            System.out.println(" Enter your choice here:");
            int choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter how many times do you want to choose this option?");
                    int count1= sc.nextInt();
                    for(int i=0;i<count1;i++)
                    {
                        System.out.println("Create user");
                    }
                break;
                case 2:
                    System.out.println("Hello, how many times do you want to choose this option?");
                    int count2= sc.nextInt();
                    for(int i=0;i<count2;i++)
                    {
                        System.out.println("Create user");
                    }
                    break;
                case 3:
                    System.out.println("Excuse me,  how many times do you want to choose this option?");
                    int count= sc.nextInt();
                    for(int i=0;i<count;i++)
                    {
                        System.out.println("Create user");
                    }
                    break;
                case 4:
                    System.out.println(" How many times do you want to choose this option?");
                    int count4= sc.nextInt();
                    for(int i=0;i<count4;i++)
                    {
                        System.out.println("Create user");
                    }
                    break;
                case 5:
                    status=false;
                    break;
                default:
                    System.out.println(" TRY AGAIN!!");
            }
        }
    }



}
