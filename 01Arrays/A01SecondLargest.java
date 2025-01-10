import java.util.*;

public class A01SecondLargest {
    public static int getSecondLargest(int[] arr) {
        // Code Here
        if(arr.length < 2 || arr == null){
            return -1;
        }

        Arrays.sort(arr);

        int result = arr[arr.length - 1];

        for(int i = arr.length - 2; i >= 0; i--){
            if(arr[i]!= result){
                return arr[i];
            }
        }
        return -1;
        
    }
    
    public static void main(String[] args) {
        int arr[] = {1,2,4,56,76,3};
        int ans = getSecondLargest(arr);
        System.out.println(ans);
        
    }
}