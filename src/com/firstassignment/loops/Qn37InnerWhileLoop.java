/**
 * WAP to print “Hello, this is while inner loop” from inner loop using while.
 */
package com.firstassignment.loops;

public class Qn37InnerWhileLoop {
    public static void main(String[] args){
int i=2;
while(i>1){
    int j=3;
    while(j>1){
        System.out.print("Hello, this is while inner loop\n");
        j--;
    }
    i--;
}
    }
}
