package Four;

public class arraymin {
    public static void main(String[] args) {
        int[] arr={3,6,4,8,7,8,2};
        int min=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(min > arr[i]){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
