package Five;

import java.util.ArrayList;

public class sumOfPRime {
    public static void main(String[] args) {
        System.out.println(sieveOfEratosthenes(50 ,2,10));
    }

    static int sieveOfEratosthenes(int N ,int lo ,int hi){
        // code here
        ArrayList<Integer>  alist=new ArrayList<Integer>();
        ArrayList<Integer>  alist2=new ArrayList<Integer>();
        int sum=0;
        for(int i=0;i<=N;i++){
            alist.add(0);
        }
        for(int i=2;i<=java.lang.Math.sqrt(N)+1;i++){
            if(alist.get(i)==0){
                for(int j=i*2;j<=N;j=j+i){

                    if(j==113){
                        System.out.println(i);
                        alist.set(j,1);
                    }
                    alist.set(j,1);

                }
            }
        }
        for(int i=lo;i<=hi;i++){
            if(alist.get(i)==0){


                    sum+=i;


            }
        }
        return sum;
    }
}