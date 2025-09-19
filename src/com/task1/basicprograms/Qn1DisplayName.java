// WAP to take input from the user and display Hello+ name as output
package com.task1.basicprograms;
import java.util.Scanner;
public class Qn1DisplayName {
    static void main(String[] args){
        //create Scanner Object
        Scanner sc=new Scanner(System.in);
       //take input from user
        System.out.println("Enter your name here:");
        String name=sc.nextLine();
        System.out.println("Hello," + name);
    }
}
