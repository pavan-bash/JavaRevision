import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String args[]) {
        Pattern p = Pattern.compile("\\w+@[a-z]+(.[a-z]+)+");
        Matcher m = p.matcher("My mail id is 18311A0507@sreenidhi.edu.in.mail.com");

        while (m.find()) {
            System.out.println("Match : " + m.group());
            System.out.println("Start from : " + m.start() + " to " + m.end());
        }
    }
}
