package Clase2.TurnoTarde;

import Clase2.TurnoTarde.Password;

public class PasswordSimple extends Password {
    public PasswordSimple(String regex) {
        super("^(?=.*[0-9])");
    }
}
