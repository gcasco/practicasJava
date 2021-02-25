package Clase3.TurnoTarde;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class MiFactory {
    public static Sorter getInstance(String objName) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //solo tomar las excepciones que puedas manejar, sino tirar para arriba
        InputStream inputStream = new FileInputStream("MiFactory.properties");
            Properties preferences = new Properties();

            preferences.load(inputStream);
            String contentPreferences = preferences.getProperty(objName);
            System.out.println("La subclase de '"+objName+"' a instanciar es: "+contentPreferences);

            return (Sorter) Class.forName(contentPreferences).getDeclaredConstructor().newInstance();


    };
}
