
package Matrix;
import java.util.*;
public class RotateMatrix {
public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int k = 90;
        rotatematrix(arr,k,3,3);
        
        
    }
    public static void rotatematrix(int [][]mat,int k,int n,int m){
        int []temp=new int[n];
        int c=0;
        k=k%n;
        for(int i=0;i<n;i++){
            for(int start=0;start<m;start++){
                temp[c++]=mat[i][start];
            }
                rotate(temp,k,n);
                System.out.println(Arrays.toString(temp));
                c=0;
        }
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
