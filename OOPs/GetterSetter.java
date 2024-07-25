import java.util.*;

public class GetterSetter{
  public static void main(String args[]){
    System.out.println("Hello World!");

    Pen pen = new Pen();

    pen.setColor("Black");
    System.out.println(pen.getColor());

  }
} 

class Pen{
  
  private String color;
  private int tip;
  
  String getColor(){
    return this.color;
  }
  
  int getTip(){
    return this.tip;
  }
  
  void setColor(String color){
    this.color = color;
  }
  void setTip(int tip){
    this.tip = tip;
  }
}