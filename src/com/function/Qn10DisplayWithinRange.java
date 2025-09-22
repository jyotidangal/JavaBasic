/**
 * WAP that displays all the numbers from range void
 * display(int start , int end)
 */
package com.function;
public class Qn10DisplayWithinRange {
    public static void main(String[] arg){
        Qn10DisplayWithinRange values=new Qn10DisplayWithinRange();
        values.printWithinRange(10,15);

    }
    public void printWithinRange(int lowerLimit, int upperLimit)
    {
        for(int i=lowerLimit ; i <=upperLimit;i++){
            System.out.println(i);
        }
    }
}


