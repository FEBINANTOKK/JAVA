package Three;

import java.util.Scanner;

//Write a program that gets n as input and print all the prime numbers till that number.
public class PrintAllPrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n > 1) {
            System.out.println(2);

            for (int i = 3; i <= n; i++) {
                int counter = 0;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        counter++;
                    }

                }
                if (counter == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
