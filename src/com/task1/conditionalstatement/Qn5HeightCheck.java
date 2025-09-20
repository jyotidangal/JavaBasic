/**
 * WAP to take the person's height in feet and convert
 * it into centimeters and display it. Also say you are tall if the
 * height in centimeters is grater than 160 cm else not tall
 */
/*
 * 1 feet = 30.48 centimeter
 */
package com.task1.conditionalstatement;
import java.util.Scanner;
public class Qn5HeightCheck {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Give your height in feet:");
        float heightInFeet = input.nextFloat();
        float heightInCm =heightInFeet * 30.48f;
        if(heightInCm > 160 ){
            System.out.println("Your height is: "+ heightInCm+ " Centimeter \n Wow, you are tall.");
        }
        else{
            System.out.println("Your height is: "+ heightInCm+ " Centimeter \n Sorry to say that, you are  not tall.");
        }


    }

}
