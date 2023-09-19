import java.util.*;
public class CalculatorSwitch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        System.out.println("Enter Character: ");
        char operator = sc.next().charAt(0);
        switch(operator){
            case '+' : System.out.println("the sum :"+ (a+b));
            break;
            case '-' : System.out.println("the substration :"+ (a-b));
            break;
            case '/' : System.out.println("the division :"+ (a/b));
            break;
            case '*' : System.out.println("the multy :"+ (a*b));
            break;
            case '%' : System.out.println("the modulo :"+ (a%b));
            break;
            default: System.out.println("Wrong Operator");
        }
    }
}
