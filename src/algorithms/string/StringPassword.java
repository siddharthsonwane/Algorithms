package algorithms.string;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringPassword {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("enter the passwod :");

        String password = in.nextLine();

        int count = 0;

        Pattern patternDigit = Pattern.compile("(\\d)");
        Pattern patternUpper = Pattern.compile("([A-Z])");
        Pattern patternLower = Pattern.compile("([a-z])");
        Pattern patternSpecial = Pattern.compile("(\\W)");

        Matcher matcherDigit = patternDigit.matcher(password);
        Matcher matcherUpper = patternUpper.matcher(password);
        Matcher matcherLower = patternLower.matcher(password);
        Matcher matcherSpecial = patternSpecial.matcher(password);

        if (!matcherDigit.find()) {
            count++;
        }
        if (!matcherUpper.find()) {
            count++;
        }
        if (!matcherLower.find()) {
            count++;
        }
        if (!matcherSpecial.find()) {
            count++;
        }
        if ((count+password.length())<6) {
            count = count + 6-(count+password.length());
        }


        System.out.println(count);


    }


}
