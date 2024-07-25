import java.util.*;
public class MultipleInheritance {
    public static void main(String args[]){
        Muslims m1 =  new Muslims();
        m1.VegCurry();
        m1.nonvegCurry();
    }
}

interface Veg{
    void VegCurry();
}

interface nonVeg {
    void nonvegCurry();
}

class Muslims implements Veg, nonVeg{
    public void VegCurry(){
        System.out.println("Eat veg Curry");
    }
    public void nonvegCurry(){
        System.out.println("Eat fish and meat");
    }
} 
