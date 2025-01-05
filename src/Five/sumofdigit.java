package Five;
//Write a recursive program to find the sum of digits of a number.
public class sumofdigit {
static int fun(int n){
    if(n%10==n)
        return n;
    int ld=n%10;
    return fun(n/10)+ld;
}
    public static void main(String[] args) {
        System.out.println(fun(5233));
}
}