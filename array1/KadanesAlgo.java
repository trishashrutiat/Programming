
package array1;

public class KadanesAlgo {
    public static void main(String []Args){
    int[] arr={1,-4,8,2,3,4,2};
    kadan k1=new kadan ();
    k1=kadane(arr,arr.length);
    System.out.println(k1.s);
    System.out.println(k1.e);
    System.out.println(k1.sum);

    }
    public static kadan kadane(int arr[],int n){
        int start=0,end;
        end=0;int s=0,e=0;
        int max=-1000;
        int sum=0; kadan k=new kadan();
        for(int i=0;i<n;i++){
            if(sum==0){
                start=i;
                end=i;
            }
            sum=sum+arr[i];
            end++;
           
            if(sum>max){
                max=sum;
                k.sum=max;
                k.s=start;
                k.e=end;}
            if(sum<0){
                sum=0;
                  }
            }
        return k;
}
}
class kadan{
    int s;
    int e;
    int sum;
}