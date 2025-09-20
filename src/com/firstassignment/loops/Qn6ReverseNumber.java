package com.firstassignment.loops;
import java.util.Scanner;
public class Qn6ReverseNumber {
    static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = input.nextInt();

        int rev=0;
        while(n!=0){
            rev=rev*10+n%10;
            n=n/10;
        }
        System.out.println("Reversed number is: "+rev);
    }
}
