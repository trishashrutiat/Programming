package array1;

import java.util.*;
import java.io.*;
public class FourSum {
    public static void main (String[]args){
        int arr[]={4,2,3,5,1,0,2};
        int size=(arr.length*(arr.length-1))/2;
        foursum(arr,size,11);
        
    }
   public static boolean noCommon(Pair a, Pair b)
    {
    if (a.first == b.first || a.first == b.second
    || a.second == b.first || a.second == b.second)
        return false;
return true;
}
    public static void  foursum(int arr[],int size,int sum){
        Pair[]aux=new Pair[size];
        int k=0;
        int s=0;
        for(int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                aux[k] = new Pair();
                aux[k].sum = arr[i] + arr[j];
                aux[k].first = i;
                aux[k].second = j;
                k++;             
            }
        }
        Arrays.sort(aux, new Comparator<Pair>() {

                public int compare(Pair a, Pair b)
                {
                    return (a.sum - b.sum);
                }
        });
        int flag=0;
        int start=0;
        int end=size-1;
        while (start < end) {
            s = aux[start].sum + aux[end].sum;
            if (s > sum) {
                end--;
            } else if (s < sum) {
                start++;
            } else {
                if(noCommon(aux[start],aux[end])){
                System.out.println("Four elements are:");
                System.out.println(aux[start].first);
                System.out.println(aux[start].second);
                System.out.println(aux[end].first);
                System.out.println(aux[end].second); 
                flag=1;
                break;
            }
        }       
    }
        if(flag==0){
     System.out.println("No suitable Pair found");
    
        }
}}
class Pair{
    int first;
    int second;
    int sum;
}
