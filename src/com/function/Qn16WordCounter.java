/**
 * Write a java program to count all the words of a string .
 * Example : I want to be a software engineer. Output : 7
 */
/*
 * Logic: here to find the no.of words we need to count the whitespace
 */
package com.function;
import java.util.Scanner;
public class Qn16WordCounter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Qn16WordCounter counter= new Qn16WordCounter();//object of class Qn16WordCounter is created
//        variable declaration

        System.out.println("Enter your thoughts here:");
        String paragraph= sc.nextLine();
        int count=counter.wordsCounter(paragraph);
        System.out.println("The no of words in give sentence are : "+count );

    }
    public int wordsCounter(String paragraph){
        int count=0;
        boolean isWord =false;

        for(int i=0; i<paragraph.length();i++ ) {
            char ch = paragraph.charAt(i);
            if (ch != ' ' && ch != '\n' && ch != '\t') {
                if (!isWord) {
                    count++;
                    isWord = true;
                }
               }
            else {
                isWord = true;
            }
        }
        return count;
    }
}
