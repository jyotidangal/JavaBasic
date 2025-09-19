package com.task1.basicprograms;
import java.util.Scanner;
public class Qn9AverageOfFiveNumbers {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=5;//total no.of inputs
        int[] num= new int[n];//creating an array
        System.out.print("Enter five numbers: ");

        for(int i = 0; i < n; i++){
            num[i]=sc.nextInt();
        }
        //calculate the average
float sum=0;
        for(int i=0;i<n;i++){
            sum=sum+num[i];
        }

        float averageOfFiveNumbers=sum/n;
        System.out.println("The average of five numbers is: "+averageOfFiveNumbers);
    }
}
