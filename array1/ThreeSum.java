package array1;

import java.util.*;
import java.io.*;
public class ThreeSum {
    public static void main(String[]args){
    int arr[]={3,4,5,2,4,6,7,9,1,4};
    threesum(arr,12);
    }
    public static void threesum(int arr[],int sum){
       Arrays.sort(arr);
       
      for(int i=0;i<arr.length-2;i++){
          int s=0;
          int start=i+1;
          int end=arr.length-1;
          while(start<end){
          s=arr[i]+arr[start]+arr[end];
          if(s<sum){
              start++;
          }
          else if(s>sum){
              end--;
          }
          else{
              System.out.println("Triplet are:");
              System.out.println(arr[i]);
              System.out.println(arr[start]);
              System.out.println(arr[end]);
              break;
          }
      }  }
        
      
    }

}