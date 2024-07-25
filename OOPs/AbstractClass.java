import java.util.*;
public class AbstractClass
 {
    public static void main(String args[]){
        Chicken chic = new Chicken();

        chic.legs();
    }
}


// abstract class er kono object create kora jai na 
abstract class Ani{
    String color;
    
    abstract void legs();
}

class Chicken extends Ani{
    void legs(){
        System.out.println("It has two legs!");
    }
}