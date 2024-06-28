
package array1;
import java.util.*;

public class RemoveDuplicate {
    public static void main(String[]Args){
        int arr[]={1,2,3,3,4,4,4,4,4,5,5,5};
        Remove(arr,arr.length);
    }
    public static void Remove(int arr[],int n){
        int i,k;k=0;
        int temp[]=new int[n];
        for(i=0;i<n-1;i++){
            if(arr[i]!=arr[i+1]){
                temp[k++]=arr[i];
            }
        }
        temp[k++]=arr[n-1];
    
    for(i=0;i<k;i++){
    System.out.println(temp[i]);
        }
}}
