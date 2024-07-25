import java.util.*;
public class Hierarchial_Inheritance {
    public static void main(String args[]){
        Mammals human = new Mammals();
        human.eat();
        human.walk();

        Birds crow = new Birds();
        crow.eat();
        crow.Fly();

        Fishes pangas = new Fishes();
        pangas.eat();
        pangas.swims();
    }
}

class Animals {
    int color; 

    void eat(){
        System.out.println("eat");
    }
    void breed (){
        System.out.println("breed!");
    }
}

class Fishes extends Animals{
    void swims(){
        System.out.println("swims");
    }
}

class Mammals extends Animals {
    void walk(){
        System.out.println("Walks!");
    }
}

class Birds extends Animals {
    void Fly(){
        System.out.println("fly");
    }
}