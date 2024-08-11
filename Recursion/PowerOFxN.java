import java.util.*;
public class PowerOFxN {

    public static int powerN(int x, int n){
        
        if (n==0) {
            return 1;
        }

        // int xnm1 = powerN(x, n-1);
        // int xn = x * xnm1;
        // return xn;

        return x* powerN(x, n-1);
    }

    public static void main(String args[]){
    System.out.println(powerN(12, 2));
    }
}
 