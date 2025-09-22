/**
 *             *
 *            **
 *           ***
 *          ****
 *         *****
 */
package com.firstassignment.loops;
import java.util.Scanner;
public class Qn25DisplayPattern {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=1;i<=5;i++)
        {
            //loop for space
            for(int space=1;space<=5-i;space++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
