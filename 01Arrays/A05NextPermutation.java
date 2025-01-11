import java.util.*;

public class A05NextPermutation {

    public static void reverse(int arr[], int start, int end){
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
    public static void nextPermutation(int[] arr) {
        
        int pivot = -1;  // let pivot be -1

        // find 1st smaller digit from end and update pivot
        for(int i = arr.length-2; i>=0; i--){
            if(arr[i]<arr[i+1]){
                pivot = i;
                break;
            }
        }
        
        // if no such permutation reverse to smallest
        if(pivot == -1){
            reverse(arr, 0, arr.length-1);
            return;
        }
        
        // find digit from right just greater than pivot element and swap them
        for(int i = arr.length-1; i>pivot; i--){
            if(arr[i]>arr[pivot]){
                arr[i] = arr[i]+arr[pivot];
                arr[pivot] = arr[i]-arr[pivot];
                arr[i] = arr[i]-arr[pivot];
                break;
                
            }
        }
        
        // now rotate elements just after pivot
        reverse(arr, pivot+1, arr.length-1);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 6, 5, 4};
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }
}
