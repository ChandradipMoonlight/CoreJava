package regexpattern;

public class EmailValidation {
    public static void main(String[] args) {
        Validate validate = new Validate();
       String result = validate.isValidEmail("chadradip@gmail.co");
        System.out.println(result);
    }
}
