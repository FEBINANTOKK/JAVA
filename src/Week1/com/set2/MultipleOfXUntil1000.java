package Week1.com.set2;

import java.util.Scanner;

public class MultipleOfXUntil1000 {
    public static void main(String[] args) {

        Scanner scn=new Scanner(System.in);
        int X=scn.nextInt();
        for (int i = X; i <=1000; i=i+X) {
            System.out.println(i);
        }
    }
}
