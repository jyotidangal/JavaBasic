package com.task1.loopsRelated;
import java.util.Scanner;
public class qn3MultiplicationTableOfNumber {
    static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive number:");
        int number = sc.nextInt();
        if(number<0)
        {
            System.out.println("Give positive number");
        }
        else {
            System.out.println("Table of "+ number+ " using for loop is: ");
            for(int i=1; i<11;i++){
                System.out.println(number+" * " + i +" = "+ number*(i));
            }
            System.out.println("Table of "+ number+ " using while loop is: ");
            int j=1;
            while(j<11){
                System.out.println(number+" * " + j +" = "+ number*(j));
                j++;
            }

        }

    }

}
