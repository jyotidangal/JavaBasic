/**
 * WAP a java program that takes a number and returns
 * the length of the number.
 */
package com.function;
import java.util.Scanner;
public class Qn15LengthOfNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Qn15LengthOfNumber len = new  Qn15LengthOfNumber();
        System.out.println("Enter a number:");
        long inputNum=sc.nextLong();
        long lengthOfNumber=len.numberLength(inputNum);
        System.out.println("Length of "+ inputNum+" is: "+lengthOfNumber);

    }
    public long numberLength(long inputNum){
        long count=0;
        while(inputNum!=0){
            inputNum=inputNum/10;
            count++;
        }
        return count;
    }
}
