package Five;
//Write a Program to find the power of a number recursively. Take two inputs, number and the power.
public class powerofnum {
    public static void main(String[] args) {
        System.out.println(power(2,6));
    }
    static int power(int n,int k){
        if(k==0){
            return 1;
        }
        return n*power(n,k-1);
    }
}
