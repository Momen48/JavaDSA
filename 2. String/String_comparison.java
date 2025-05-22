public class String_comparison {
    public static void main(String[] args) {
        String s1= "Tony";
        String s2= "Tony";
        String s3= new String("Tony");

        if (s1==s2){
            System.out.println("S1 and S2 are borabor");
        }
        else{
            System.out.println("not fuainna");
        }

        if (s1==s3){
            System.out.println("new String er shoman");
        }
        else{
            System.out.println("Abba is not shoman of Baiccha");
        }
    }
}
