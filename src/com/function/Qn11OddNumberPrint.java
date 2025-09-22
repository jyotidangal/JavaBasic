/**
 * WAP that displays all the odd numbers from range void displayOddNumbers(int start , int end)
 */
package com.function;

public class Qn11OddNumberPrint {
    public static void main(String[] args){
        Qn11OddNumberPrint odd = new Qn11OddNumberPrint();
        odd.displayOddNumbers(10,20);

    }
    public void displayOddNumbers(int start, int end){
        System.out.println("The odd numbers are: ");
        for(int i=start; i<=end;i++){
            if(i %2!=0){
                System.out.println(i);
            }

        }
    }
}
