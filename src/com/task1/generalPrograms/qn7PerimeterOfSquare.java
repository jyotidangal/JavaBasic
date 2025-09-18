package com.task1.generalPrograms;

import java.util.Scanner;
public class qn7PerimeterOfSquare {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the square (cm):");
        float length = sc.nextFloat();
        float perimeterOfSquare=4*length;

        System.out.println("The perimeter of the circle is "+perimeterOfSquare+" cm");

    }
}
