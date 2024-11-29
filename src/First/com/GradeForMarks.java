package First.com;

import java.util.Scanner;

public class GradeForMarks {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int Mark=scn.nextInt();
        if(Mark>=90){
            System.out.println("Grade A\n" );
        } else if (Mark>=80) {
            System.out.println("Grade B\n" );
        }
        else if (Mark>=60) {
            System.out.println("Grade C\n" );
        }
        else if (Mark>=35) {
            System.out.println("Grade D\n" );
        }
        else {
            System.out.println("Fail\n" );
        }

    }
}
