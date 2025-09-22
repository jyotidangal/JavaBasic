/**
 * WAP to print the multiplication table of a number
 * using a function printMultiplication(int inputNumber)
 */
package com.function;
import java.util.Scanner;
public class Qn14MultiplicationTable {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Qn14MultiplicationTable table = new Qn14MultiplicationTable();

        System.out.println("Enter a number:");
        int inputNumber=sc.nextInt();
        System.out.println("Multiplication table of number "+inputNumber+" is:");
        table.printMultiplication(inputNumber);
    }

    public void printMultiplication(int inputNumber){
        for(int i=1; i<=10;i++){
            System.out.println(inputNumber +
                    "*" +
                    i +
                    "="+
                    inputNumber*i);
        }
    }

}
