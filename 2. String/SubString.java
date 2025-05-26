public class SubString {
    
    public static String SubStr(String str, int si, int ei){
        String subString = "";
        for (int i = 0; i < ei; i++) {
            subString +=str.charAt(i);
        }
        return subString;
    }

    public static void main(String[] args) {
        String str = "Hello World";
        //System.out.println(SubStr(str, 0,4));
        System.out.println(str.substring(0,5));
    }
}
