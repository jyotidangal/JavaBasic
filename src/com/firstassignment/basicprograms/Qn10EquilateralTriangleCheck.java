//WAP in java to check whether the triangle is equilateral or not
package com.firstassignment.basicprograms;
import java.util.Scanner;

public class Qn10EquilateralTriangleCheck {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first side of triangle:");
        float firstSide = sc.nextFloat();
        System.out.println("Enter the secondSide of triangle:");
        float secondSide = sc.nextFloat();
        System.out.println("Enter the third side of triangle:");
        float thirdSide = sc.nextFloat();
        if (firstSide <= 0 || secondSide <= 0 || thirdSide <= 0) {
            System.out.println(" Sides should be positive");
        } else {
            if (firstSide == secondSide && thirdSide == firstSide) {
                System.out.println(" Triangle is equilateral");

            } else {
                System.out.println("Triangle is not equilateral");
            }
        }
    }
}
