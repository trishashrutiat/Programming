/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array1;

public class PascalsTriangle {
    public static void main(String []Args){
        int n=7;
        pascal(n);
    }
    public static void pascal(int n){
        for(int i=0;i<n;i++){
            int j=0;
             while(j<=i){
                   System.out.print(binomialCoeff(i,j));  
                   j++;
                }
             System.out.println();
        }
        
    }
    public static int binomialCoeff(int n, int k)
{
int res = 1;
if (k > n - k)
k = n - k;
for (int i = 0; i < k; ++i) {
res *= (n - i);
res /= (i + 1);
}
return res;
}
    public static int fact(int num){
        int p=1;
        for(int i=1;i<=num;i++){
            p=p*i;            
        }
        return p;
    }
}
