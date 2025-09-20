/**WAP to check whether a triangle can be formed by the given value for the angles.[Sum  of the angles in a triangle should be 180 ]
 Test Data :
 40 55 65
 Expected Output :
 The triangle is not valid.
 */
package com.task1.conditionalstatement;
import java.util.Scanner;
public class Qn10TriangleValidityTest {
    public static void main(String[] args)
    {
        Scanner sc =  new Scanner(System.in);
        System.out.println(" Enter first angle:");
        float firstAngle=sc.nextInt();
        System.out.println(" Enter second angle:");
        float secondAngle=sc.nextInt();
        System.out.println(" Enter third angle:");
        float thirdAngle=sc.nextInt();
        float sum = firstAngle+secondAngle+thirdAngle;
        if(sum == 180){
            System.out.println(" The triangle is valid.");
        }
        else{
            System.out.println(" The triangle is not valid.");
        }


    }

}
