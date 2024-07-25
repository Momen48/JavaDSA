import java.util.*;


// for Static 
public class StaticM  {
    public static void main(String args[]){
        
        Sdudent s1 = new Sdudent();
        s1.SchlName = "ccpc";

        Sdudent s2 = new Sdudent();
        System.out.println(s2.SchlName);
    }
}

class Sdudent{
    String nam;
    int roll;

    static String SchlName;

    void setNam(String nam){
        this.nam = nam;
    }
    String getNam(){
        return this.nam;
    }
}
 