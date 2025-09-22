package com.function;
import java.util.Scanner;
public class Qn8SumOfThree {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        Qn8SumOfThree sum= new Qn8SumOfThree();
        sum.sum(2,4,6);

    }
    public void sum(int num1, int num2, int num3){
        int sum=num1+num2+num3;
        System.out.println("sum  of three is:"+sum);
    }
}
