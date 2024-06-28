
package array1;
import java.util.*;
public class Intersection {
      public static void main(String[]args){
        int []a={3,1,2,4,5};
        int []b={1,2,3};
        Intersection(a,b);
    }
      static void Intersection(int arr1[], int arr2[])
    {
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> hs1 = new HashSet<>();
 
        for (int i = 0; i < arr1.length; i++)
            hs.add(arr1[i]);
 
        for (int i = 0; i < arr2.length; i++)
            if (hs.contains(arr2[i]))
                System.out.print(arr2[i] + " ");
    }
}
