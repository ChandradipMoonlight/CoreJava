package regexpattern;

import java.util.regex.Pattern;

public class Validate {
     String emailPattern = "^[a-zA-Z0-9_+&*-]+(?:\\."+
            "[a-zA-Z0-9_+&*-]+)*@" +
            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
            "A-Z]{2,7}$";
     public String isValidEmail(String email) {
         Pattern pattern = Pattern.compile(emailPattern);
         if (email==null)
             return "Please enter the valid emil address";
         else if (pattern.matcher(email).matches())
             return "Valid Email Address";
         else
             return "Valid Email address";
     }
}
