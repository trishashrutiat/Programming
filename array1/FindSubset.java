package array1;
import java.util.*;

public class FindSubset {
    public static void main(String[] args) {
        int[] arr1 = {2, 4, 5, 6, 7};
        int[] arr2 = {2, 4, 8};
        int result = subset(arr1, arr1.length, arr2, arr2.length);
        if (result == 1) {
            System.out.println("Yes, it is a subset");
        } else {
            System.out.println("No, it is not a subset");
        }
    }

    public static int subset(int arr1[], int n, int arr2[], int m) {
        int i = 0, j = 0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        while (i < n && j < m) { // Add condition to check bounds for arr1
            if (arr1[i] == arr2[j]) {
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                return 0;
            }
        }
        if (j == m) {
            return 1;
        } else {
            return 0;
        }
    }
}
