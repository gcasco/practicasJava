package Clase1y2;

public class PasswordIntermedia extends Password{
    public PasswordIntermedia(String regex) {
        super("^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])");
    }
}
