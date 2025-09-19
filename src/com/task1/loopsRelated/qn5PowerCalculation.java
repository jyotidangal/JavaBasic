package com.task1.loopsRelated;
import java.util.Scanner;
public class qn5PowerCalculation {
     static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println(" Enter a firstNumber:");
        int firstNumber= input.nextInt();
        System.out.println(" Enter the secondNumber:");
        int secondNumber = input.nextInt();
        int power=1;
        for(int i=1; i<=secondNumber; i++){
            power=power*firstNumber;
        }
        System.out.println("The Power of "+firstNumber+" raised to  "+secondNumber+" is:"+power);
    }
}
