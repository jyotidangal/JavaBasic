/**
 * WAP in java to take a string input from the user and display the
 * same string incrementing the ascii value by 1. You should exclude thespecial characters


 *Here we need mutable string ,where we can't do with the primitive datatype: string so
 * We can use the mutable sequence of characters: StringBuilder
 * by using this we can append ,insert ,delete,replace or reverse the characters
 */
package com.task1.conditionalstatement;
import java.util.Scanner;
public class Qn12CharacterIncrement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        StringBuilder incrementedString= new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch>='a' && ch <'z'||ch>='A' && ch < 'Z'){
                ch++;
            }
            else if(ch == 'z')
            {
                ch='a';
            }
            else if(ch =='Z'){
                ch= 'A';
            }
            incrementedString.append(ch);
        }
        System.out.println("Existing String is: "+str);
        System.out.println("New string is: "+incrementedString);
    }
}
