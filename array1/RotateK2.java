package array1;
import java.util.*;

public class RotateK2 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6, 9};
        int k = 2;
        rotate(arr, k, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static void rotate(int[] arr, int k, int n) {
        reverse(arr, n - k, n - 1);
        reverse(arr, 0, n - k - 1);
        reverse(arr, 0, n - 1);
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
    }
}
