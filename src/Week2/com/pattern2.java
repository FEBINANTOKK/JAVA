package Week2.com;

import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        int n=scan.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = n-i; j >0; j--) {
                System.out.print(j);

            }
            System.out.println();
        }
    }
}
