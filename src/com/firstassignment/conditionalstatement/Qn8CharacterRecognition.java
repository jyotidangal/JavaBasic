/**
 * WAP in java to take a character input from a keyboard and print whether it vowel or consonant.
 *
 */
package com.firstassignment.conditionalstatement;
import java.util.Scanner;
public class Qn8CharacterRecognition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character:");
        String input = sc.next();
        char ch = input.charAt(0);
        if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'I' || ch == 'i' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U') {
            System.out.println(ch + " is Vowel letter.");
        }
        else{
                System.out.println(ch+" is Consonant letter.");
        }

        }
    }

