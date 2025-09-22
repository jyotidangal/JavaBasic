/**
 * Write a program to print the circumference and area of a circle of
 * radius entered by the user by defining your own method.
 */
package com.function;
import java.util.Scanner;
public class Qn4CircleMetrics {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        Qn4CircleMetrics circle = new Qn4CircleMetrics();
        System.out.println("Enter radius of circle:");
        float radius=input.nextFloat();
        circle.circle(2.0f);

    }
    public void circle(float radius){
        float circumference=2*3.14f*radius;
        float area=3.14f*radius*radius;
        System.out.println("Circumference of circle:"+circumference);
        System.out.println("Area of circle: "+area);
    }

}
