import java.util.*;
public class StringBuilder {

    public static String compressString(String word){
    StringBuilder str = new StringBuilder();

    int n = word.length();
    int i = 0;

    while (i<n) {
        char c = word.charAt(i);
        int count = 0;

        while (count+i <n && word.charAt(i+count) == c && count < 9 ) {
            count++;
        }
        str.append(count);
        str.append(c);

        i += count;
    }
    return str.toString();

    }
}
