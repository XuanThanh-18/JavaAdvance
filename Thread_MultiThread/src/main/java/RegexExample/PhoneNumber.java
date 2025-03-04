package RegexExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    public static void main(String[] args) {
        List<String> phoneNumbers = Arrays.asList("0934567891","091342356222");
        Pattern patternPhone = Pattern.compile("^09[0-9]{8}$");
        for(int i=0;i<phoneNumbers.size();i++){
            Matcher matcher = patternPhone.matcher(phoneNumbers.get(i));
            if(matcher.find()){
                System.out.println(matcher.group());
            }
        }
    }
}
