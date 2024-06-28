
package array1;
import java.util.*;
/**
 *
 * @author Administrator
 */
public class ArrayEqual {
    public static void main(String[]Args){
        int []arr1={1,2,3,4,5};
        int[] arr2={1,2,3,4,6,7,7,5,4,3,2};
        int c=CheckEqual(arr1,arr1.length,arr2,arr2.length);
        if (c==1){
            System.out.println("Arrays are Equal");
        }
        else{
            System.out.println("Arrays are not Equal");
        }
    }
    public static int CheckEqual(int arr1[],int n,int arr2[],int m){
        if (n==m){
            Arrays.sort(arr1);
            Arrays.sort(arr2);
           int i=0;int j=0;
           while(i<n&&j<m){
               if(arr1[i]!=arr2[j]){
                   return 0;
               }
               i++;
               j++;             
           }
           return 1;
        }
       return 0;
    }
}
