/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array1;

import java.util.*;

// Define the Pair class within the TwoSum class or import it if in a separate file
class Pair {
    int start;
    int end;
}

public class TwoSum {
    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 2, 4};
        Pair result = new Pair();
        result = TwoSum(arr, 8, 0, 4);
        if (result.start == -1 && result.end == -1) {
            System.out.println("Elements not found");
        } else {
            System.out.println("Indexes of the pair:");
            System.out.println(result.start);
            System.out.println(result.end);
        }
    }

    public static Pair TwoSum(int arr[], int sum, int start, int end) {
        Arrays.sort(arr);
        int s = 0;
        while (start < end) {
            s = arr[start] + arr[end];
            if (s > sum) {
                end--;
            } else if (s < sum) {
                start++;
            } else {
                Pair p = new Pair();
                p.start = start;
                p.end = end;
                return p;
            }
        }
        // If pair not found, return pair with indexes set to -1
        Pair p1 = new Pair();
        p1.start = -1;
        p1.end = -1;
        return p1;
    }
}

