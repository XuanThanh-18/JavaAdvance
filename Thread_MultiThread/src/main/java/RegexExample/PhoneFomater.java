package RegexExample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneFomater {
    public static void main(String[] args) {
        String input ="Ban co the lieen hej coi chin toi qua sdt;: 0912342383 va emial  thanh@gamilcom";

        Pattern phonePattern = Pattern.compile("09[0-9]{8}");

        //replace all
        String result = input.replaceAll("09[0-9]{8}", "<a href=\"tel:$0\"$0</a>");

        result = result.replaceAll("[a-z\\.]+@[a-z]{2,}.[a-z]{2,}", "<a href=\"mailto:$0\">$0</a>");

        System.out.println(result);
    }
}
