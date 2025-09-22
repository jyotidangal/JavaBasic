/**
 * Create a class called MainProgram and inside the class create
 * a function called display() with no parameters and
 * inside a body of display method add a line “Hello,
 * I am called”. Call the function from the main method of MainProgram by creating
 * the object of MainProgram.
 */
package com.function;

public class Qn1Display {
    public static void main(String[] args){
        Qn1Display display = new Qn1Display();

        display.display();


    }

    public void display(){
        System.out.println("Hello, I am called");
    }
}

