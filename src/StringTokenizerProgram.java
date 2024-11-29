import java.util.StringTokenizer;

public class StringTokenizerProgram {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("26-07-2002","-"); // "-" is delim/seperator

        while(st.hasMoreTokens())
        {
            System.out.println(st.nextToken());
        }
    }
}
