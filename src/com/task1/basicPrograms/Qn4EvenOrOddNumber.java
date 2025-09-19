package com.task1.basicPrograms;
import java.util.Scanner;
public class Qn4EvenOrOddNumber {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        take input a number
        System.out.println("Enter a number:");
        int number=sc.nextInt();
        if(number%2==0){
            System.out.println("A number "+number +" is even");
        }
        else{
            System.out.println("A number "+number + " is Odd");
        }
    }
}
