package utility;

import java.util.regex.Pattern;

public class Validation {

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

    public static boolean isValidNationalCodeWithRegex(String nationalcode){
        Pattern pattern = Pattern.compile("^[0-9]{10}$");
        return nationalcode.matches(pattern.pattern());
    }
}
