
package array1;
import java.util.*;
public class MaximumProSubarray {
    public static void main(String []Args){
        int arr[]={6,-3,-10,0,2};
        System.out.println(maxsubarray(arr,arr.length));
        
    }
    public static int maxsubarray(int arr[],int n){
       int i,j,res,p;
       p=1;res=0;
       for(i=0;i<n;i++){
           p=arr[i];
           for(j=i+1;j<n;j++)
           {
               p=p*arr[j];
               res=max(res,p);
           }
       }
       return res;
    }
    public static int max(int a,int b)
    {
        if(a>b){
            return a;
        }
        else
        {
            return b;
        }
    }
}
