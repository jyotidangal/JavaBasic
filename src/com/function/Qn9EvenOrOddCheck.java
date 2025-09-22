package com.function;

public class Qn9EvenOrOddCheck {
        public static void main(String[] args){
            Qn9EvenOrOddCheck numProp=new Qn9EvenOrOddCheck();
            boolean status=  numProp.isEven(20);
            if(status==true) {
                System.out.println("Number is even:");
            }
            else{
                        System.out.println("Number is odd:");
            }


}
public boolean isEven(int number){
    if(number % 2==0){
        return true;
    }
    else
    {
        return false;
    }
}

}
