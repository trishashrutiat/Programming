
package array1;

import java.lang.Math;
public class Sqrt2 {
    public static void main(String[]Args){
        int x=4;
        System.out.println(Sqrt(x));
}
 public static int Sqrt(int x){
        double check=Math.exp(Math.log(x)/2);
        int result=(int)check;
        if(result*result==x){
            System.out.println("Square root");
            return result;
        }
        else {
            System.out.println("Floored Square root");
            return result;
        }
            
}
 
}