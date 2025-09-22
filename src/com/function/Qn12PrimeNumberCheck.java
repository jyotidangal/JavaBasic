package com.function;
import java.util.Scanner;
public class Qn12PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Qn12PrimeNumberCheck prime = new Qn12PrimeNumberCheck();
//take input
        System.out.println("enter a number:");
        int num = sc.nextInt();
//        calling or invoking function
        boolean status = prime.checkPrime(num);
        if(status) {
            System.out.println(" Number is prime");
        }
        else{
            System.out.println(" Number is not prime");
        }

    }

    public boolean checkPrime(int num) {
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}






