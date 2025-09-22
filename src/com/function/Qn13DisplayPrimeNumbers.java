package com.function;

public class Qn13DisplayPrimeNumbers {
    public static void main(String[] args) {
        int count=0;
        System.out.println("Prime numbers in between 0-100 are:.");
        Qn12PrimeNumberCheck prime = new Qn12PrimeNumberCheck();
        for(int i=1; i<=1000;i++){
          boolean status= prime.checkPrime(i);

          if(status){
              System.out.print(i+" ");
              count++;
          }

        }
        System.out.println("\n total count of prime numbers:"+count);


    }


}
