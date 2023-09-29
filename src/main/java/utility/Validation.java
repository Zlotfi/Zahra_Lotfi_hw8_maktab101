package utility;

import java.util.regex.Pattern;

public class Validation {

    public static boolean isValidPassword(String password) {
        if (password.length() < 8)
            return false;
        char[] passwordArray = password.toCharArray();
        char[] signArray = new char[]{'!', '@', '#', '%', '^', '&'};
        int space = 0, lowerCase = 0, upperCase = 0, sign = 0, digit = 0;
        for (int i = 0; i < passwordArray.length; i++) {
            char c = passwordArray[i];
            if (Character.isSpaceChar(c))
                space++;
            if (Character.isUpperCase(c))
                upperCase++;
            if (Character.isLowerCase(c))
                lowerCase++;
            if (Character.isDigit(c))
                digit++;
            for (int j = 0; j < signArray.length; j++) {
                char value = signArray[j];
                if (c == value)
                    sign++;
            }
        }
        if (space > 0 && lowerCase > 0 && upperCase > 0 && sign > 0 && digit > 0)
            return true;
        else
            return false;
    }

    public static boolean isValidPasswordWithRegex(String password) {
        Pattern pattern =
                Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,10}$");
        return password.matches(pattern.pattern());
    }

    public static boolean isValidEmailWithRegex(String email){
        Pattern pattern = Pattern.compile("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
        return email.matches(pattern.pattern());
    }

    public static boolean isValidWebsiteWithRegex(String website){
        Pattern pattern = Pattern.compile("(https:\\/\\/www\\.|http:\\/\\/www\\.|https:\\/\\/|http:\\/\\/)?[a-zA-Z0-9]{2,}(\\.[a-zA-Z0-9]{2,})(\\.[a-zA-Z0-9]{2,})?");
        return website.matches(pattern.pattern());
    }

    public static boolean isValidPhoneNumberWithRegex(String phonenumber){
        Pattern pattern = Pattern.compile("^[\\+]?[(]?[0-9]{3}[)]?[-\\s\\.]?[0-9]{3}[-\\s\\.]?[0-9]{4,6}$");
        return phonenumber.matches(pattern.pattern());
    }
}
