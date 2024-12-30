package one.set1;
import java.util.Scanner;

class ReadInput{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int Num=scn.nextInt();
        char ch=scn.next().charAt(4);
        String str=scn.next();
        System.out.println(Num);
        System.out.println(ch);
        System.out.println(str);
    }

}