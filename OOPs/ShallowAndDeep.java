import java.util.*;
public class ShallowAndDeep {
    public static void main(String args[]){
        System.out.println("Constructor");

        Stu s1=new Stu();
        s1.name = "Momen";
        s1.roll = 48;
        s1.password = "abcd";
         
        s1.marks[0] = 100;
        s1.marks[1] = 90; 
        s1.marks[2] = 80; 

        Stu s2 = new Stu(s1);
        s2.password = "xyz";
        s1.marks[1] = 95;
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        } 
    }
}

class Stu{
    int roll;
    String name;
    String password;
    int marks[]; 

    //Shallow copy constructor 
// Student(Student s1){
//     marks = new int[3];
//     this.name = s1.name;
//     this.roll = s1.roll;
//     this.marks = s1.marks;   
// }


// Deep Copy constructor

Stu(Stu s1){
    marks = new int[3];  
    this.name = s1.name;
    this.roll = s1.roll;
   
    for (int i = 0; i < marks.length; i++) {
        this.marks[i] = s1.marks[i]; 
    }
}


Stu(){
    marks = new int[3];
}

// parameterized constructor
Stu(String name){
        this.name=name;
        marks = new int[3];
    }
    Stu(int roll){
        this.roll=roll;
        marks = new int[3];
    }
}