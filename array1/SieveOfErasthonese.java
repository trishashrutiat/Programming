
package array1;

public class SieveOfErasthonese {
    public static void main(String[]Args){
        int n=100;int count=0;int start=0;
        boolean []prime=new boolean[n+1];
        prime[0]=false;
        prime[1]=false;
        for(int i=2;i<n;i++){
            prime[i]=true;
        }
        for(int i=2;i<n;i++){
            if(prime[i]==true){
                 count=i;
                 start=i;
            }
            for(int p=start+count;p<n;p=p+count){
                prime[p]=false;
            }
        }
        for(int i=0;i<n;i++){
            if(prime[i]==true){
            System.out.println(i);
        }
        }
        
    }
    
}
