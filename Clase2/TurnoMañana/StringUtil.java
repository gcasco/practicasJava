package Clase2.TurnoMañana;

public class StringUtil {
    // Retorna una cadena compuesta por n caracteres c
    // Ejemplo: replicate('x',5) ==> 'xxxxx'
    public static String replicate(char c, int n)
    {
        return "";
    }

    // Retorna una cadena de longitud n, compuesta por s
    // y precedida de tantos caracteres c como sea necesario
    // para completar la longitud mencionada
    // Ejemplo lpad("5",3,'0') ==> "005"
    public static String lpad(String s, int n, char c)
    {
        StringBuilder relleno=new StringBuilder("");
        for (int i = 0; i < n; i++) {
            if (s.length() < n) {
                for (int j = s.length(); j < n; j++) {
                    relleno.append(c);
                }
            }
        }
        return relleno.append(s).toString();
    }

    // Retorna una cadena de longitud n, compuesta por s
    // y precedida de tantos caracteres c como sea necesario
    // para completar la longitud mencionada
    // Ejemplo lpad("5",3,'0') ==> "005"
    public static String rpad(String s, int n, char c)
    {
        StringBuilder relleno=new StringBuilder("");
        relleno.append(s);
        for (int i = 0; i < n; i++) {
            if (s.length() < n) {
                for (int j = s.length(); j < n; j++) {
                    relleno.append(c);
                }
            }
        }
        return relleno.toString();
    }

    //// Elimina espacios, tabuladores y retornos delante.
    //System.out.println(text.replaceAll("^\\s*",""));
    public static String ltrim(String s){
        return s.replaceAll("^\\s*","");
    }
    ///// Elimina espacios, tabuladores y retornos detrás.
    //System.out.println(text.replaceAll("\\s*$",""));
    public static String rtrim(String s){
        return s.replaceAll("^\\s*$","");
    }

    public static String trim(String s){
        return s.trim();
    }

    //Retorna la posición de la n-ésima
    //ocurrencia del carácter c dentro de s, o -1 si s no contiene a c.
    public static int indexOfN(String s,char c,int n){
        return s.indexOf(""+c,n);
    }

    // Retorna un String[] conteniendo los elementos de arr
    // representados como cadenas de caracteres
    public static String[] toStringArray(int arr[])
    {
        return null;
    }

    // Retorna un String[] conteniendo los elementos de arr
    // representados como cadenas de caracteres
    public static int[] toIntArray(String arr[])
    {
        return null;
    }

    // Retorna la longitud del elemento con mayor cantidad
    // de caracteres del array arr
    public static int maxLength(String arr[])
    {
        return 0;
    }

    // Completa los elemento del arr agregando caracteres c
    // a la izquierda, dejando a todos con la longitud del mayor
    public static void lNormalize(String arr[], char c)
    {
    }
}
