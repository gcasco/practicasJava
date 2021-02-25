package Clase1y2;

public class PasswordFuerte extends Password{
    //private String regexClass;

    public PasswordFuerte(String regex) {
        super(  "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$");
    }
}
