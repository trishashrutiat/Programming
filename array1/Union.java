package array1;
import java.util.*;

public class Union {
    public static void main(String[]args){
        int []a={3,1,2,4,5};
        int []b={1,2,3};
        union(a,5,b,3);
    }
    public static void union(int a[],int n,int b[],int m){
        HashSet<Integer>hs=new HashSet<>();
        int min=(n<m)?n:m;
        for(int i=0;i<min;i++){
            hs.add(a[i]);
            hs.add(b[i]);         
        }
        if(n>m){
             for(int i=m;i<n;i++){
                 hs.add(a[i]);
             }
        }
        else{
            for(int i=n;i<m;i++){
                 hs.add(b[i]);
             }
        }
        
            System.out.println(hs.toString());
    }
}
