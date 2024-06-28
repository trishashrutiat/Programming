
package Zoho;

public class Snake {
    public static void main(String[]Args){
        int mat[][]={{1,2,3},{4,5,6},{7,8,9}};
}
   public static int forward(int mat[][],int start,int end,int nrow,int ncol){
       int j=start;
       
       while(j<end){
           System.out.println(mat[start][j]);
           j++;
       }
       if(start==ncol &&j==ncol){return 1;}
       else{
       start++;
       backward(mat,start,end,nrow,ncol);
       }
       
   return 0;     
} 
     public static void backward(int mat[][],int start,int end,int nrow,int ncol){
       int j=start;
       
       while(j>end){
           System.out.println(mat[start][j]);
           j--;
       }      
       start++;
       forward(mat,start,ncol,nrow,ncol);     
} 
   
   
}