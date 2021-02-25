package Clase3;

import java.io.*;
import java.util.Comparator;
import java.util.Properties;

public class MiFactory {
    public static Object getInstance(String objName) {
        try (InputStream inputStream = new FileInputStream("MiFactory.properties")) {
            Properties preferences = new Properties();
            // load a properties file
            preferences.load(inputStream);
            String contentPreferences = preferences.getProperty(objName);
            System.out.println("La subclase de '"+objName+"' a instanciar es: "+contentPreferences);
            return Class.forName(contentPreferences);

        }catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }


        //Class sorter = Class.forName(objName);

        return new Object();
    };
}
