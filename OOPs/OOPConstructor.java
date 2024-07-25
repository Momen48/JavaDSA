import java.util.*;
public class OOPConstructor{
    public static void main(String args[]){
        Student1 s1= new Student1();
        
        Student1 s2 = new Student1("Momen");
        System.out.println(s2.name);

        Student1 s3 = new Student1(48);
        System.out.println(s3.roll);
         
    }
}

class Student1{
    int roll;
    String name;
// non Parameter

Student1(){
    System.err.println("First Constructor Called.....");
}

// parameterized constructor
    Student1(String name){
        this.name=name;
    }
    Student1(int roll){
        this.roll=roll;
    }
}