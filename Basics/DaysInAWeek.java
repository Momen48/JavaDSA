import java.util.*;
public class DaysInAWeek {
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        int a = sc.nextInt();
        switch (a) {
            case 1:
                System.out.println("Saturday");
                break;
            case 2:
                System.out.println("Sunday");
                break;
            case 3:
                System.out.println("Monday");
                break;
            case 4:
                System.out.println("Tuesday");
                break;
            case 5:
                System.out.println("Wednesday");
                break;
            case 6:
                System.out.println("Thursday");
                break;
            case 7:
                System.out.println("Its Friday Bitch! Get some rest!");
                break;                        
            default:
                System.out.println("I am not a god to create a day number :"+a+" for you! Get a life kiD!");
                break;
        }
    }
}
