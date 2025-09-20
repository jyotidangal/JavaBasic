/**
 * WAP to print “Hello, this is do while inner loop” from inner loop using do while.
 */
package com.firstassignment.loops;

public class Qn39DoWhileInnerLoop {
    public static void main(String[] args){
        int i=0;
        do{
            int j=0;
            do{
                System.out.println("Hello, this is do while inner loop");
                j++;
            }while(j<=3);
i++;
        }while(i<=3);
    }
}
