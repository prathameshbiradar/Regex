import java.util.regex.Pattern;

public class EmailPattern {
    public static void main(String[] args) {

        boolean validMail = Pattern.matches("[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+","psbiradar948@yahoo.co.in");
        System.out.println("is mail valid: "+validMail);

        boolean b1 = Pattern.matches("[a-zA-Z0-9][a-zA-Z0-9]*@gmail[.]com","psbiradar948@gmail.com");
        System.out.println("Mail id is valid? "+b1);
    }
}
