import java.util.*;
public class Area {
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        float pi =3.14f;
        float radius = sc.nextFloat();

        float area = pi*radius*radius;

        System.out.println("Area :" + area);

    }
}
