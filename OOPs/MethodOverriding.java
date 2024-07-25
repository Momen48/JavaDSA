import java.util.*;
public class MethodOverriding{
    public static void main(String args[]){
        Students1 s1 = new Students1();
        s1.school();
    }
}


class Teacher{
    void school(){
        System.out.println("Teaches in school!");
    }
}

class Students1 extends Teacher{
    void school(){
        System.out.println("learn in school!");
    }
}
