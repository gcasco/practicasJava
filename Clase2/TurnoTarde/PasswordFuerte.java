package Clase2.TurnoTarde;

import Clase2.TurnoTarde.Password;

public class PasswordFuerte extends Password {
    //private String regexClass;

    public PasswordFuerte(String regex) {
        super(  "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$");
    }
}
