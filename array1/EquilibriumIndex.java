package array1;

public class EquilibriumIndex {
    public static void main(String[] args) {
        int arr[] = {4, 2, 2, 4, 2, 2};
        Equilibrium(arr, arr.length);
    }

    public static void Equilibrium(int arr[], int n) {
        int start = 0, end = n - 1;
        int sum1 = 0, sum2 = 0;

        while (start <= end) {
            if (sum1 < sum2) {
                sum1 += arr[start];
                start++;
            } else {
                sum2 += arr[end];
                end--;
            }
        }

        if (sum1 == sum2 && start == end + 1) {
            System.out.println("Index found");
        } else {
            System.out.println("Index not found");
        }
    }
}
