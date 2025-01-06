package Five;

public class divisors {

    public static void main(String[] args) {
        isDivisor(1,60);
    }
     static void isDivisor(int i,int  n){

if(i>Math.sqrt(n)+1){


    return;
}
if(n%i==0) {
    System.out.println(i);
    System.out.println(n /i);
}
isDivisor(i+1,n);
    }
}
