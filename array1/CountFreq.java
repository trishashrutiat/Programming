
package array1;
import java.util.*;
public class CountFreq {
    public static void main(String[]args){
        int arr[] = {10, 20, 20, 10, 10, 20, 5, 20};
        int n = arr.length;
        countfreq(arr, n);
        
        
    }
    public static void countfreq(int arr[],int n){
        Map <Integer,Integer>mp=new HashMap<>();
        int i=0;
       for(i=0;i<n;i++){
       if(mp.containsKey(arr[i])){
           mp.put(arr[i], mp.get(arr[i])+1);
          
       }
       else{
           mp.put(arr[i],1);
       }
       }
        for (Map.Entry<Integer, Integer> entry : mp.entrySet())
        {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    
 
        
    }
}
