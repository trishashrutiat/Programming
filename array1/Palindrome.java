package array1;

import java.util.*;
public class Palindrome {
    public static void main(String[]args){
        int num =1234432;
        String n= Integer.toString(num);
        char arr[]=n.toCharArray();
        int start=0,end=arr.length-1;
        while(start<end){
            if(arr[start]==arr[end]){
                start++;
                end--;
             }
            else if(arr[start]!=arr[end])
                System.out.println("Not a palindrome number");
                break;
            
            
    }
                    System.out.println("Palindrome number");

    
    }
    
}
