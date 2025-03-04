package RegexExample;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneExtractor {
    public static void main(String[] args) {
        String input = "Ban co the lieen hej coi chin toi qua sdt;: 0912342383 va emial  thanh@gamilcom";

        Pattern phonePattern = Pattern.compile("09[0-9]{8}");

        Matcher phoneMatcher = phonePattern.matcher(input);
        List<String> doundPhonenumbe=new ArrayList<String>();
        while (phoneMatcher.find()) {
            doundPhonenumbe.add(phoneMatcher.group());
        }
        for(String phone:doundPhonenumbe){
            System.out.println(phone);
        }
    }
}
