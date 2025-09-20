/**
 * Write a program in java to take input three sides of triangle and check if the
 * triangle is equilateral or isosceles or scalene.

 * if all sides are equal then triangle is equilateral
 * if two of three sides are equal then triangle is isosceles
 * if no sides are equal then triangle is is Scalene
 */

package com.firstassignment.conditionalstatement;
import java.util.Scanner;
public class Qn9TriangleCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side a:");
        float a =sc.nextFloat();
        System.out.println("Enter side b:");
        float b =sc.nextFloat();
        System.out.println("Enter side c:");
        float c =sc.nextFloat();
        if(a == b){
            if(a == c)
            {
                System.out.println(" Triangle is Equilateral");
            }
            else{
                System.out.println(" Triangle is isosceles");
            }
        }
        else{
            System.out.println(" Triangle is Scalene");
        }

    }
}
