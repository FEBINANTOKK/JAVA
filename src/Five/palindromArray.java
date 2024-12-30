package Five;

public class palindromArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,3,0,1};
        boolean palindrom=true;
        int[] revArray= new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            revArray[arr.length-i-1]=arr[i];
        }
        for (int i = 0; i <arr.length ; i++) {
           if(revArray[i]==arr[i]){
               continue;
           }
           else {

               palindrom=false;

           }
        }
        if(palindrom){
            System.out.println(" Palindrom");
        }
        else {
            System.out.println("Not Palindrom");
        }
    }
}
