/**
 * Write a  program in java to take input coordinate xand y from the user and
 * find in which quadrant does the coordinate lies.
 * i) +x  +y Q1
 * ii) -x  +y Q2
 * iii)-x   -y Q3
 * iv) +x  -y  Q4
 */
package com.task1.conditionalstatement;
import java.util.Scanner;
public class Qn6QuadrantCheck {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter x coordinate: ");
        int x=sc.nextInt();
        System.out.println(" Enter y coordinate: ");
        int y=sc.nextInt();
        if(x>0 && y>0){
            System.out.println("  point ("+x+","+y+") lies in first quadrant.");
        }
        else if(x < 0 && y > 0){
            System.out.println("  point ("+x+","+y+") lies in Second quadrant.");
        }
        else if(x<0 && y <0)
        {
            System.out.println("  point ("+x+","+y+") lies third quadrant.");
        }
        else{
            System.out.println("  point ("+x+","+y+") lies in fourth quadrant.");
        }

    }
}
