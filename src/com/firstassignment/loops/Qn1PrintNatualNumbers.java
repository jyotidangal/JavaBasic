//WAP in java to print numbers from 1 to 10
package com.firstassignment.loops;
import java.util.Scanner;
public class Qn1PrintNatualNumbers {
    static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        //let's create an array that accepts 100 numbers

     System.out.println("Enter no. of elements have to print:");
     int n = sc.nextInt();
     System.out.println("Using for loop:");
//     display using for loop
     for(int i=0; i<n;i++)
     {
         System.out.println(i+1);
     }
//Display using while loop
        System.out.println("Using while loop:");
        int j=0;
        while(j<n)
        {

            System.out.println(j+1);
            j++;
        }

    }
}
