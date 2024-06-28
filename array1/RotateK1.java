
package array1;
import java.util.*;

/**
 *
 * @author Administrator
 */
public class RotateK1 {
    public static void main(String[]Args){
        int []arr={1,3,4,5,6,9};
        int k=2;
        rotate(arr,k,arr.length);
    }
    public static void rotate(int arr[],int k,int n){
        k=k%n;
        int i=0;
        while(i<k){
            System.out.println(arr[n-i-1]);
            i++;
        }
        
            for(int j=0;j<n-k;j++){
                System.out.println(arr[j]);
            }
            
    }
}
