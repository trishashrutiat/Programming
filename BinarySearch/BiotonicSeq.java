package BinarySearch;
import java.util.*;

public class BiotonicSeq {
    public static void main(String[] args) {
        int arr[] = {5, 6, 7, 8, 9, 10, 3, 2, 1}; 
        int b = findBitonicPoint(arr, arr.length, 0, arr.length - 1);
        int result1 = ascendingSearch(arr, 0, b, 3);
        int result2 = descendingSearch(arr, b, arr.length - 1, 67);
        if (result1 != -1 || result2 != -1) {
            System.out.println("Element found");
        } else {
            System.out.println("Element Not found");
        }
    }

    public static int ascendingSearch(int arr[], int low, int high, int key) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static int descendingSearch(int arr[], int low, int high, int key) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static int findBitonicPoint(int arr[], int n, int l, int r) {
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (arr[mid] < arr[mid - 1]) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1; // This means bitonic point not found
    }
}
