package Week1.com.set2;

import java.util.Scanner;

public class PrintXOfYTimes {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int X=scn.nextInt();
        int Y=scn.nextInt();
        for (int i = 1; i <=Y; i++) {
            System.out.print(X+" ");
        }
    }
}
