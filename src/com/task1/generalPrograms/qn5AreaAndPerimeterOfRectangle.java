//WAP in a java to print the area and perimeter of a rectangle
/* we know
areaOfRectangle=length*width
perimeterOfRectangle=2*(length+width)
 */
package com.task1.generalPrograms;
import java.util.Scanner;
public class qn5AreaAndPerimeterOfRectangle {
    static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of the rectangle(in cm): ");
        float length=sc.nextFloat();
        System.out.println("Enter the width of the rectangle(in cm): ");
        float width=sc.nextFloat();

//calculation
       float areaOfRectangle=length*width;
       float perimeterOfRectangle=2*(length+width);
       System.out.println("The area of the rectangle is "+areaOfRectangle+ " cm");
       System.out.println("The perimeter of the rectangle is "+perimeterOfRectangle+" cm");

    }
}
