/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matrix;

public class SearchInSortedMatrix {
    public static void main(String[]Args){
        int mat[][]={ { 0, 6, 8, 9, 11 },
                      { 20, 22, 28, 29, 31 },
                      { 36, 38, 50, 61, 63 },
                      { 64, 66, 100, 122, 128 } };
        int n=4;
        int m=5;
        findRow(mat,n,m,50);
 
    }
    public static void findRow(int mat[][],int n,int m,int key){
        int low=0;
        int high=m-1;
       while(low<=high){
        int mid=(low+(high-low))/2;
        if(mat[mid][0]==key){
            System.out.println("Element found");
        }
        if(mat[mid][m-1]==key){
            System.out.println("Element found");
        }
        if(mat[mid][0]>key){
            high=mid-1;
        }
        else if(mat[mid][0]<key&&mat[mid][m-1]<key){
            low=mid+1;
        }
        else if(mat[mid][0]<key&&mat[mid][m-1]>key){
           binarySearch(mat,n,m,key,mid);
              return;
        
    }
       
    }
    }
    public static int binarySearch(int a[][],int n,int m,int k,int x){
        
    
        int l = 0, r = m - 1, mid;
        while (l <= r) {
            mid = (l + r) / 2;
 
            if (a[x][mid] == k) {
                System.out.println("Found at (" + x + ","
                                   + mid + ")");
                return 1;
            }
 
            if (a[x][mid] > k)
                r = mid - 1;
            if (a[x][mid] < k)
                l = mid + 1;
        }
        return 0;
    }
   
}