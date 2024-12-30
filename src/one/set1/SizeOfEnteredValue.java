package one.set1;

import java.util.Scanner;

public class SizeOfEnteredValue {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int Value=scn.nextInt();
        switch (Value){
            case 29:
                System.out.println("Small");
                break;
            case 30:
                System.out.println("Medium");
                break;
            case 38:
                System.out.println("Large");
                break;
            case 42:
                System.out.println("XLarge");
                break;
            default:
                System.out.println("Invalid Entry");
        }
    }
}
