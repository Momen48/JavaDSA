import java.util.*;
public class OOPS{
    public static void main(String args[]){
        Pen pen1 =new Pen(); // create a new object 
        pen1.setColor("Red");
        System.out.println(pen1.color);

        pen1.setTip(5);
        System.out.println(pen1.tip);

        BankAccount bAcc= new BankAccount();
        bAcc.userName = "Momen";
        bAcc.setPass("1234"); 
    }
}

/**
 * BankAccount
 */
 class BankAccount {
    public String userName;
    private String password;

    public void setPass(String pass){
        password= pass;
    }
}

/**
 *  
 * n */
 class  Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}