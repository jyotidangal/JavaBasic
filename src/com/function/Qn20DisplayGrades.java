package com.function;
import java.util.Scanner;
public class Qn20DisplayGrades {
    //executor function call
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Qn20DisplayGrades gd=new Qn20DisplayGrades();
        System.out.println("Enter your marks here:");
        float marks =sc.nextFloat();
        if(marks <0 || marks >100){
            System.out.println("Invalid input!,enter marks in between 0-100 marks");
        }
        String grade=gd.gradeCalculator(marks);
        System.out.println("your grade is: "+grade);

    }
    //method for grading
    public String gradeCalculator(float marks){
        String grade=" ";
        if(91<=marks && marks <=100){
            grade="AA";
        }
        else if(81<=marks && marks <=90 ){
            grade="AB";
        }
        else if(71<=marks  && marks <=80 ){
            grade="BB";
        }
        else if(61<=marks  && marks <=70 ){
            grade= "BC";
        }
        else if(51<=marks  && marks <=60 ){
            grade="CD";
        }
        else if(41<=marks  && marks <=50 ){
           grade="DD";
        }
        else if(marks <=40){
            grade="Fail";
        }
        return grade;

    }

}
