package array1;

public class EuilibriumInd {
    public static void main(String[] args) {
        int arr[] = {4, 2, 2, 1, 4, 2, 2};
        Equilibrium1(arr, arr.length);
    }

    public static void Equilibrium1(int arr[], int n) {
        int sum = 0;
        int leftsum = 0;
        int rightsum;

        // Calculating total sum of the array
        for (int i = 0; i < n; ++i) {
            sum += arr[i];
        }

        for (int i = 0; i < n; i++) {
            // Subtract the current element from the total sum to get right sum
            rightsum = sum - leftsum - arr[i];
            if (leftsum == rightsum) {
                System.out.println("Index found at position " + i);
                return;
            }
            leftsum += arr[i];
        }
        // If no equilibrium index is found
        System.out.println("Index not found");
    }
}
