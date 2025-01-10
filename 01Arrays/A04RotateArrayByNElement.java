// https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/rotate-array-by-n-elements-1587115621

import java.util.Arrays;

public class A04RotateArrayByNElement {
    
    public static void rotateArray(int arr[], int d){
        int n = arr.length;
        
        // If d is greater than n, take modulus to get the correct rotation
        d = d % n;
        
        // Reverse first d elements
        reverseArray(arr, 0, d - 1);
        
        // Reverse remaining n - d elements
        reverseArray(arr, d, n - 1);
        
        // Reverse the entire array
        reverseArray(arr, 0, n - 1);
        
    }

    public static void reverseArray(int arr[], int start, int end){
        // Swap elements from start to end
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int d = 2;
        
        rotateArray(arr, d);
        
        System.out.println(Arrays.toString(arr));
    }
}
