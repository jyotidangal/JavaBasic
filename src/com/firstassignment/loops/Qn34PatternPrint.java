package com.firstassignment.loops;
import java.util.Scanner;
public class Qn34PatternPrint {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for(int x=0; x <5;x++){
            for(int y=0; y<x;y++){
                System.out.print('*');
            }
            System.out.println('\n');
        }
        for(int i=0 ; i<5 ; i++){
            for(int j=i; j<5;j++){
                System.out.print('*');
            }
            System.out.println('\n');
        }
    }
}
