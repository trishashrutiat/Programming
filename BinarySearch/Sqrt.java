
package BinarySearch;


public class Sqrt {
    
    public static void main(String[]Args){
        int x=4;
        int c=binsearch(0,x/2,x);
        System.out.println(c);
        
    }
    public static int binsearch(int low,int high,int key){
        int mid;
        int ans=0;
        
        while(low<=high){
            mid=(low+(high-low))/2;
            if(mid*mid==key){
                System.out.println("Square root is");
                return mid;
            }
            else if((mid*mid)<key){
                low=mid+1;
                ans=mid;
            }
            else if(mid*mid>key){
                high=mid-1;
                
            }
        }        
        System.out.println("Floor of Square root is");

        return ans;    
    }
    
    
}
