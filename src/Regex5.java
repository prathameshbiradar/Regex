import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex5 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\s");
        String[]s1 = p.split("Durga Soft solutions");
        for(String s : s1)
        {
            System.out.println(s);
        }
        Pattern p1 = Pattern.compile("\\.");
        String[]s2 = p1.split("www.durgasoft.com");
        for(String s: s2)
        {
            System.out.println(s);
        }
    }
}
