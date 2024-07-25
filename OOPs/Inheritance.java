import java.util.*;
public class Inheritance {
    public static void main(String args[]){
        System.out.println("hello`");

       // Fish shark = new Fish();
       // shark.eat();
       Dog dog = new Dog();
       dog.eat();
       dog.leg = 4;
       System.out.println("total legs: " + dog.leg);
    }
}

// parent class or base class
class Animal{
    String color; 
    void eat() {
        System.out.println(" eats ");
    }
    void breathe(){
        System.out.println(" breathes");
    }
}

// child / derived class

// class Fish extends Animal{

//     int fins;
//     void swim(){
//         System.out.println(" swims");
//     }
// }

class Mammal extends Animal{
    int leg;
}

class Dog extends Mammal {
    String breed;
}

