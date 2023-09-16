import java.util.*;
public class Operator2 {
    public static void main(String args[]){
        int x=20, y=50, z=100;
        if(x>y && y>z){
            System.out.println("HELLO!");
        }
        if(z>y || z<x){
            System.out.println("Yap!");
        }
        if (y+200<x && y+100<z) {
            System.out.println("Hawayein");
        }

    }
}
