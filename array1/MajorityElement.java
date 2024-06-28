
package array1;
import java.util.*;
public class MajorityElement {
  public static void main(String[]Args){
      int arr[]={3,4,2,1,3,4,4,4,5,4,4,4};
      frequency(arr,arr.length);
  }  
  public static void frequency(int arr[],int n){
      HashMap <Integer,Integer> hm=new HashMap<>();
      for(int i=0;i<n;i++){
          if(hm.containsKey(arr[i])){
              hm.put(arr[i], hm.get(arr[i])+1);
              
              if(hm.get(arr[i])>n/2){
                  System.out.print("Majority Element");
                  System.out.println(arr[i]);
              }
              
          }
          else{
              hm.put(arr[i],1);
          }
      }
  }
}
