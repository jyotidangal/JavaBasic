package com.function;
import java.util.Scanner;
public class Qn5VoterEligibility {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Qn5VoterEligibility eligible=new  Qn5VoterEligibility();
        eligible.eligibleVoters(20);
    }
    public void eligibleVoters(int age){
        if(age>=18){
            System.out.println("Your are eligible for voting");
        }
        else{
            System.out.println("Your are not eligible");
        }
    }
}
