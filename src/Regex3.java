import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex3 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[^a-zA-Z0-9]");
        Matcher m = p.matcher("ahdi 1os9@ ");

        while(m.find())
        {
            System.out.println(m.start()+"...."+m.group());
        }
    }
}
