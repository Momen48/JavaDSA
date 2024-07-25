import java.util.*;
public class SumOfN {

    public static int SumofNnaturalNumber(int n){
        if (n==1) {
            return 1; 
        }
        int fn= SumofNnaturalNumber(n-1);
        int fSum = n + SumofNnaturalNumber(n-1);
        return fSum;
    }
    public static void main(String args[]){
        int n= 5b ;
        System.out.println(SumofNnaturalNumber(n));
    }
}
 