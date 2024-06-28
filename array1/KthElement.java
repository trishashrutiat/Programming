package array1;
import java.util.*;

public class KthElement {
    public static void main(String[] args) {
        int[] arr1 = {2, 4, 5, 6, 7};
        int[] arr2 = {2, 4, 8};
        int k=4;
        int[] sortedArray = mergeWithoutDuplicates(arr1, arr2);
        System.out.println("Merged array without duplicates:");
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
        System.out.println(sortedArray[k]);
    }

    public static int[] mergeWithoutDuplicates(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int[] mergedArray = new int[n + m];
        int i = 0, j = 0, k = 0;
        
        // Merge arrays while skipping duplicates
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else if (arr1[i] > arr2[j]) {
                mergedArray[k++] = arr2[j++];
            } else { // Both elements are equal, skip one of them
                mergedArray[k++] = arr1[i++];
                j++;
            }
        }
        // Add remaining elements of arr1
        while (i < n) {
            mergedArray[k++] = arr1[i++];
        }
        // Add remaining elements of arr2
        while (j < m) {
            mergedArray[k++] = arr2[j++];
        }
        
        // Resize the array to remove extra space
        return Arrays.copyOf(mergedArray, k);
    }
}
