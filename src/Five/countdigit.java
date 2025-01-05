package Five;

public class countdigit {
    public static void main(String[] args) {
       int num=3987625;
        System.out.println(countDigit(num));

        }
    public static int countDigit(int n){
        if(n%10==n){
            return 1;
        }
        return 1+countDigit(n/10);
    }
}
