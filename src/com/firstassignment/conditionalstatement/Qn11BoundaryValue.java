package com.firstassignment.conditionalstatement;
import java.util.Scanner;
public class Qn11BoundaryValue {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter fromNumber(lower limit): ");
        int fromNumber = sc.nextInt();
        System.out.println("Enter toNumber (Upper limit)");
        int toNumber = sc.nextInt();
        if(fromNumber <=0 || toNumber <=0){
            System.out.println(" Both numbers should be greater than 0");
        }
        else if(fromNumber < toNumber)
        {
            for(int i=fromNumber; i < toNumber; i++)
            {
                System.out.println(i);
            }
        }
        else{
            int temp=fromNumber;
            fromNumber=toNumber;
            toNumber=temp;
            for(int i=fromNumber; i < toNumber; i++)
            {
                System.out.println(i);
            }
        }
    }
}
