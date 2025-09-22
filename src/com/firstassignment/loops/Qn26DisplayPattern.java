/**
 * WAP to print
 *        1
 *       212
 *      32123
 *     4321234
 *    543212345
 */
package com.firstassignment.loops;

public class Qn26DisplayPattern {
    static void main(String[] args) {
        for(int i=1;i<=5;i++){
            //print space
            for(int space=1; space<=5-i;space++){
                System.out.print(" ");
            }
            //to display left side part
            for(int left=i; left>0;left--){
                System.out.print(left);
            }
            //to display right side
            for(int right=2; right<=i;right++)
            {
                System.out.print(right);
            }
            System.out.print("\n");
        }

    }
}
