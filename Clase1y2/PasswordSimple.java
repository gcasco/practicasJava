package Clase1y2;

public class PasswordSimple extends Password{
    public PasswordSimple(String regex) {
        super("^(?=.*[0-9])");
    }
}
