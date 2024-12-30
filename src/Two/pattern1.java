package Two;

import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {


        Scanner scan= new Scanner(System.in);
        int n=scan.nextInt();for (int i = n; i >0; i--) {
            for (int j = i; j >0; j--) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
}
