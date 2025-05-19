import java.util.Scanner;

public class Ex_2 {
    public static void main(String[] args) {
        double pi, r , a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of radius: ");
        r=sc.nextDouble();
        pi = 3.1416;
        a = pi*r*r;
        
        System.out.println("area of the circle: "+ a);
    }
}
