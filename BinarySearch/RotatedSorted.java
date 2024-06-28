package BinarySearch;

public class RotatedSorted {
    public static void main(String[] args) {

        int[] arr = {4, 5, 6, 1, 2};
        int key = 76;
        int p = pivotElement(arr, arr.length);
        int result1 = binsearch(arr, 0, p-1, key);
        int result2 =  binsearch(arr, p+1, arr.length-1, key);
       if(result1!=0|result2!=0)
           System.out.print("Element found");
       else
           System.out.print("Element Not found");
    }

    public static int binsearch(int arr[], int low, int high, int key) {
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
               System.out.println(arr[mid]);
// Changed to avoid integer overflow
            if (arr[mid] == key) {
                return 1;
            } else if (arr[mid] > key) {
                high = mid - 1; // Changed to move the search to the right half
            } else {
                low = mid+1; // Changed to move the search to the left half
            }
        }
        return 0;
    }

    public static int pivotElement(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) { // Changed the loop to iterate till n-1
            if (arr[i] > arr[i + 1]) {
                return i;
            }
        }
        return 0;
    }
    
    //binarysearch
    static int findPivot(int arr[], int low, int high)
    {
        // base cases
        if (high < low)
            return -1;
        if (high == low)
            return low;
 
        /* low + (high - low)/2; */
        int mid = (low + high) / 2;
        if (mid < high && arr[mid] > arr[mid + 1])
            return mid;
        if (mid > low && arr[mid] < arr[mid - 1])
            return (mid - 1);
        if (arr[low] >= arr[mid])
            return findPivot(arr, low, mid - 1);
        return findPivot(arr, mid + 1, high);
    }
    
}
