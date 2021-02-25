package Clase2.TurnoTarde;

import Clase2.TurnoTarde.Password;

public class PasswordIntermedia extends Password {
    public PasswordIntermedia(String regex) {
        super("^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])");
    }
}
