import java.util.*;
public class CheckPassOrFail {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = ((a>=33)? "Pass": "Fail");
        System.out.println(b);
    }
}
