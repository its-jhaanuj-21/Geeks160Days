import java.util.Arrays;

public class A02MoveAllZeroesToEnd {

    public static void pushZeroesToEnd(int arr[]){
        int j = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,0,0,5,6,9,0,3,2,0,0,44,67,8};
        pushZeroesToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }
}