package com.day2.Shape;
import java.util.Scanner;

public class ShapeExecutor {

    static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        Rectangle rectangle = new Rectangle(20,10);
        RectangleFunction rectangleFunction=new RectangleFunction();
        System.out.println("1 Rectangle Area & Perimeter");
        System.out.println("2 Circle Area & Perimeter");
        System.out.println("3 exit");
        System.out.println("Enter your choice here:");
        int choice= input.nextInt();
        boolean status=true;
        while(status)
        {
            switch (choice) {
                case 1:
                    rectangleFunction.calculateArea(rectangle);
                    break;
                case 2:
                    break;
                case 3:
                   status=false;
                    break;
                default:
                    System.out.println("Invalid choice");
            }


        }
    }
}
