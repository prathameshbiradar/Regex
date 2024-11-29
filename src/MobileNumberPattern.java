import java.util.regex.Pattern;

public class MobileNumberPattern {
    public static void main(String[] args) {

        boolean correct =Pattern.matches("(0|91)?[7-9]{1}[0-9]{9}","9623240798");
        System.out.println("is mobile no matches with the pattern: "+correct);

        boolean iscorrect = Pattern.matches("[789][0-9]{9}","9623240798");
        System.out.println("mobile no.is correct: "+iscorrect);

        boolean iscorrect1 = Pattern.matches("0?[7-9][0-9]{9}","7843038332");
        System.out.println("Is mobile no.matches with pattern: "+iscorrect1);

    }
}
