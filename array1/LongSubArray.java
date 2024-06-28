package array1;

import java.util.*;

public class LongSubArray {
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 4, 5, 6, 1, 2, 3};
        int result = LongSub(arr1, 8);
        System.out.println(result);
    }

    public static int LongSub(int arr[], int n) {
        int max = 0;
        for (int i = 0; i < n; i++) {
            int count = 1; // Initialize count to 1 for the current element
            for (int j = i; j < n - 1; j++) {
                if (arr[j + 1] == arr[j] + 1) {
                    count++;
                } else {
                    break;
                }
            }
            if (count > max) {
                max = count;
            }
        }
        return max;
    }
}
