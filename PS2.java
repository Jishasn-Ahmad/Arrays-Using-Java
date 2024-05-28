package Arrays.PS;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class PS2 {
    static void print2largest(Integer arr[], int arr_size){
        Arrays.sort(arr, Collections.reverseOrder());

        for(int i=1;i<arr_size;i++){
            if(arr[i]!=arr[0]){
                System.out.print("The second largest"+"element is %d\n");
                return;
            }
        }
        System.out.print("There is no second"+"largest element\n");
    }

    public static void main(String[] args) {
        Integer arr[] = {12,35,1,10,34,1};
        int n = arr.length;
        print2largest(arr,n);
    }
}
