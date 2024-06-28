
package array1;
import java.util.*;
/**
 *
 * @author Administrator
 */
public class CheckEqualHash {
    public static void main(String[]Args){
        int []arr1={1,2,3,4,5};
        int[] arr2={1,2,3,4,5};
        int c=CheckEqual(arr1,arr1.length,arr2,arr2.length);
        if (c==1){
            System.out.println("Arrays are Equal");
        }
        else{
            System.out.println("Arrays are not Equal");
        }
    }
    public static int CheckEqual(int arr1[],int n,int arr2[],int m){
        HashSet <Integer> hs=new HashSet<>();
        if(n==m){
        for(int i=0;i<n;i++){
            hs.add(arr1[i]);           
        }
        int n1=hs.size();
        for(int i=0;i<m;i++){
            hs.add(arr2[i]);           
        }
        if(n1!=hs.size())
        {
        return 0;
        }
        else
            return 1;
            }
        return 0;
    
    
    }

}
