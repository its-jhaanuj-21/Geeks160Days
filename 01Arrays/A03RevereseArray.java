import java.util.Arrays;

public class A03RevereseArray {
    public static void reverseArray(int arr[]) {
        // code here
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {0,1,2,3,4,5,6,7};
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
