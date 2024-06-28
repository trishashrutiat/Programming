package array1;
import java.util.*;
//summatio method can also be used n*n+1/2
public class Missing {
    public static void main(String[]args){
        int arr[]={1,2,7,6,3,8,5};
        int len=arr.length;
        Arrays.sort(arr);
        int i=0,flag=0;
        while(i<len){
            if(arr[i]==i+1)
                i++;
            else{
                System.out.println("missing element");
                 System.out.println(i+1);
                 flag=1;
                 break;
        }}
        if(flag==0){
            System.out.println("missing element");
                 System.out.println(len+1);
        
        }}
    }

