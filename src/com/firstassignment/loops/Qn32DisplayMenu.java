/**
 *  Write a program to display menu :
 * Continue
 * Exit
 * If 1 is chosen then reshow the above menu.
 * If 2 is chosen, print how many times option 1 was chosen and terminate the program.
 * If any other value is provided as input then print invalid input and reshow the above menu.
 */
package com.firstassignment.loops;
import java.util.Scanner;
public class Qn32DisplayMenu {
    public static void main(String[] args){
        //object created
        Scanner sc=new Scanner(System.in);
        Qn32DisplayMenu menu= new Qn32DisplayMenu();
        menu.menu();
        boolean status=true;
        int count=0;
        while(status){
        System.out.println("Enter you choice here:");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
                menu.menu();
                count++;
                break;
            case 2:
                System.out.println("The no of times option 1 chosen: "+count);
                status=false;
                break;
            default:
                System.out.println("Invalid Input!,here is menu:");
                menu.menu();
        }
        }


    }
    //method or function to display menu
    public void menu()
    {
        System.out.println("********************************************");
        System.out.println("1 Continue");
        System.out.println("2 Exit");
        System.out.println("********************************************");


    }

}
