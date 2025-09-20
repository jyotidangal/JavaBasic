/**
 * WAP to take marks in 5 subjects of the student, the marks must not be less than 0 and also must not
* be greater than 100.calculate the total scored by the student and find his/her grade.
 */
package com.task1.conditionalstatement;
import java.util.Scanner;
public class Qn7GradePointCalculator {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("***********************************");
        System.out.println("1 Calculate your grade");
        System.out.println("2 Exit");
        System.out.println("***********************************");
        boolean status= true;
        while(status){
            System.out.println("Enter your choice here:");
            int choice =sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter your marks(0-100");
                    int totalMarks=0;
                   for(int i=0;i<5;i++)
                   {
                       // input the marks
                       System.out.print("Marks of subject "+(i+1)+":");
                       int mark=sc.nextInt();
                       if(mark <0 ||mark > 100)
                       {
                          System.out.println("Invalid input! Marks must be between 0 and 100");
                          i--;//redo marks input
                           continue;
                       }
                       totalMarks+=mark;//total marks

                   }
                   double average=totalMarks/5.0;//average marks
                    char grade;
                    if (average >= 90) {
                        grade = 'A';
                    } else if (average >= 80) {
                        grade = 'B';
                    } else if (average >= 70) {
                        grade = 'C';
                    } else if (average >= 60) {
                        grade = 'D';
                    } else {
                        grade = 'F';
                    }
                    System.out.println("Total marks:"+totalMarks);
                    System.out.println("Grade: " + grade);

                    break;
                case 2:
                    status=false;
                    break;
                default:
                    System.out.println(" Invalid choice!");
            }
        }
    }
}
