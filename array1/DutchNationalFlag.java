//pointer approach
package array1;
import java.util.*;
public class DutchNationalFlag {
    public static void main(String[]Args){
        int[]arr={1,2,1,2,0,0,0,2,2,2};
        arr=DNF(arr,arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static int[] DNF(int arr[],int n){
        int low,i,high;
        low=0;
        i=0;
        int temp;
        high=n-1;
        while(i<n &&i<=high){
          if(arr[i]==0)  {
              temp=arr[low];
              arr[low]=arr[i];
              arr[i]=temp;
              low++;
              i++;
          }
          else if(arr[i]==2){
              temp=arr[high];
              arr[high]=arr[i];
              arr[i]=temp;
              high--;
              
          }
          else{
              i++;
          }         
    }
        return arr;
}
}