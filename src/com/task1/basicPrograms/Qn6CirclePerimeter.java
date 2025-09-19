package com.task1.basicPrograms;

import java.util.Scanner;

public class Qn6CirclePerimeter {
//    static final float PI= 3.14f;
    static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of the circle (cm):");
        float radius = sc.nextFloat();
        double perimeterOfCircle=2 * Math.PI*radius;
        String formattedPerimeter= String.format("%.2f",perimeterOfCircle);
        System.out.println("The perimeter of the circle is "+formattedPerimeter+" cm");

    }
}
