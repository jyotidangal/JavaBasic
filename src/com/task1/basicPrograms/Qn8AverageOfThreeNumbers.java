package com.task1.basicPrograms;
import java.util.Scanner;
public class Qn8AverageOfThreeNumbers {
    static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int n=3;
        int[] arr=new int[n];
//  take inputs
        for(int i=0; i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
//        calculate sum
        float sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        float averageOfThree=sum/n;
        System.out.println("The average of three numbers is: "+averageOfThree);


    }
}
