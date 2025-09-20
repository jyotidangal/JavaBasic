package com.firstassignment.conditionalstatement;
import java.util.Scanner;
public class Qn13ConditionChecking {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        boolean status=true;
        while(status){
            System.out.println("******************************");
//            System.out.println(" Number should be exactly divisible by 2\n" +
//                    "The length of string should be between 5 to 10\n" +
//
//                    "The string’s first letter should start from ‘a’ or ‘b’ or ‘s’ or ‘p’ regardless of case. It may be upper or lower case\n" +
//                    "The number should be between 2 and 4 digits\n" +
//                    "The string should not contain any of given characters ‘x’ or ’y’ or’ z’"+
//                    "The string should not contain any of given characters ‘x’ or ’y’ or’ z’\n" +
//                    "The number should always starts with odd digits\n" +
//                    "Display “Eureka” if all conditions are matched !!!");
            System.out.println("1 String input");
            System.out.println("2 Number input");
            System.out.println("3 exit");
            System.out.println("******************************");
            System.out.println("Enter your choice here: ");
            int choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter a string:");
                    sc.nextLine();
                    String str = sc.nextLine();
                    int length=str.length();
                   if(length>=5 && length<= 10)
                   {
                        char firstLetter=str.charAt(0);
                       if(firstLetter =='a'||firstLetter =='A'||firstLetter == 'b'||firstLetter == 'B'||firstLetter =='s'||firstLetter =='S'||firstLetter =='p'||firstLetter =='P'){
                            for(int i=0; i < length; i++){
                                char ch=str.charAt(i);
                                if(ch=='x'||ch=='X'||ch == 'y'||ch=='Y'||ch=='z'||ch=='Z'){
                                    System.out.println("The string should not contain any of give characters  ‘x’ or ’y’ or 'z'");
                                }
                               else{
                                   break;
                                }
                            }
                           System.out.println("The string is: "+str);
                        }
                       else
                       {
                       System.out.println("The string’s first letter should start from ‘a’ or ‘b’ or ‘s’ or ‘p’ regardless of case. It may be upper or lower case");
                        }
                   }
                   else{
                       System.out.println("The length of string should be 5 to 10.");
                   }
                    break;
                case 2:
                    System.out.println("Enter a number:");
                    int number=sc.nextInt();
                    if(number % 2==0)
                    {  int num=number,rem=0;
                        int numLength=String.valueOf(number).length();// calculate the no of digits in number
                        if( numLength >=2 && numLength <= 4 ){
                          while(num!=0){
                              rem=num%10;
                              num=num/10;
                          }
                            if(rem % 2 == 0)
                            {
                                System.out.println("The number should always starts with odd digits");

                            }
                            else{
                                System.out.println("The given number is: "+number);
                            }
                        }
                        else{
                            System.out.println("The number should be between 2 and 4 digits");
                        }
                    }
                    else{
                        System.out.println("Number should be exactly divisible by 2");
                    }
                    break;
                    case 3:
                        status=false;
                        break;
                default:
                    System.out.println(" Invalid choice");
            }
        }
    }
}
