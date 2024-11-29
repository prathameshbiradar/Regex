import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {
    public static void main(String[] args) {
        Pattern p =Pattern.compile(".s"); // .represents a single character
        Matcher m =p.matcher("as");
        boolean b1 = m.matches();

        boolean b2 = Pattern.compile(".s").matcher("as").matches();
       boolean b3 = Pattern.matches(".s","as");
        System.out.println(b1+" "+b2+" "+b3);

    }
}