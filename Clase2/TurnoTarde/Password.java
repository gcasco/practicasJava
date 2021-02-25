package Clase2.TurnoTarde;
import java.util.regex.*;

public class Password {
    private String regex;
    private String value;

    public Password(String regex){
        this.regex=regex;
    }

    public void setValue(String pwd) throws Exception {
        if(isValidPassword(pwd)){
            this.value=pwd;
        }
        else{
            throw  new Exception("La contraseña ingresada es invalida, pruebe con alguna que se ajuste a "+this.regex);
        }
    }

    public boolean isValidPassword(String password)
    {
        // Regex to check valid password.
        //String regex = "^(?=.*[0-9])"
        //       + "(?=.*[a-z])(?=.*[A-Z])"
        //       + "(?=.*[@#$%^&+=])"
        //       + "(?=\\S+$).{8,20}$";

        // Compile the ReGex
        Pattern p;
        p = Pattern.compile(this.regex);

        // If the password is empty
        // return false
        if (password == null) {
            return false;
        }

        // Pattern class contains matcher() method
        // to find matching between given password
        // and regular expression.
        Matcher m = p.matcher(password);

        // Return if the password
        // matched the ReGex
        return m.matches();
    } }
