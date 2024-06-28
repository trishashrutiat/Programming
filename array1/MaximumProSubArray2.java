
package array1;

public class MaximumProSubArray2 {
    public static void main(String[]args){
        int n=10;
        boolean []prime=new boolean[n+1];
        for(int i=0;i<n;i++){
            prime[i]=true;
        }
        for(int p=2;p<n;p++){
            if(prime[p]==true){
                int i=p;
                int count=p;
                while(i<n){
                    prime[i]=false;
                    i=i+count;
                }
            }
        }
}
}