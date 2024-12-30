package one.set1;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int Num1=scn.nextInt();
        int Num2=scn.nextInt();
        int Num3=scn.nextInt();
        int angle=Num1+Num2+Num3;
        if(angle==180){
            System.out.println("Triangle can be formed\n" );
        }else{
            System.out.println("Triangle cannot be formed\n" );
        }


    }
}
