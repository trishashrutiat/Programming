package array1;
import java.util.*;

public class DutchNationalFlag2 {
    public static void main(String[]Args){
        int[] arr = {1, 2, 1, 2, 0, 0, 0, 2, 2, 2};
        arr = DNF(arr, arr.length);
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    
    public static int[] DNF(int[] arr, int n){
        int count0 = 0, count1 = 0, count2 = 0;
       
        for(int i = 0; i < n; i++) {
            if(arr[i] == 0)
                count0++;
            else if(arr[i] == 1)
                count1++;
            else
                count2++;
        }
        
        int[] temp = new int[n];
        int index = 0;
        index = mergeArray(temp, index, count0, 0);
        index = mergeArray(temp, index, count1, 1);
        mergeArray(temp, index, count2, 2);
        
        return temp;
    }
    
    public static int mergeArray(int[] arr, int start, int count, int element){
        for(int i = start; i < start + count; i++){
            arr[i] = element;
        }
        return start + count;
    }
}
