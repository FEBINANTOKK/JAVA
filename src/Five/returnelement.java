package Five;

public class returnelement {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        int key=4;
        System.out.println(display(arr,key));
    }


    public static int display(int[] arr, int key) {
      return arr[key];
    }
}
