package Clase3;

import Clase3.TurnoMañana.Celular;
import Clase3.TurnoMañana.Persona;
import Clase3.TurnoMañana.SortUtil;
import Clase3.TurnoTarde.MiFactory;
import Clase3.TurnoTarde.Sorter;
import Clase3.TurnoTarde.Time;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Comparator;

public class program {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IOException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //programaTM();
        programaTT();
    }
    public static void programaTT() throws NoSuchMethodException, IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Time timer = new Time();
        int cantidad = 1000;
        //Ejercicio 13
        Integer[]  numeros = new Integer[cantidad];
        for (int i=0;i<cantidad;i++){
            numeros[i]=cantidad-i;
        }
        timer.start();
        Sorter sorter =  MiFactory.getInstance("sorter");
        Comparator<Integer> cInt = (a,b)->a-b;
        sorter.sort(numeros,cInt);
        System.out.println("Ordenado:"+ Arrays.toString(numeros));
        /*///
        Ejercicios hasta el 11
        Integer[] arrInt = new Integer[]{1, 2, 3, 45, 67, 8, 97, 52};
        Comparator<Integer> cInt = (a,b)->a-b;
        sorter.sort(arrInt,cInt);
        System.out.println("Ordenado:"+ Arrays.toString(arrInt));
        System.out.println("<------------------------->");
        String[] arrString = new String[]{"gisel","julia","pamela","josefina"};
        Comparator<String> cString = (a,b)->a.compareTo(b);
        sorter.sort(arrString,cString);
        System.out.println("Ordenado:"+ Arrays.toString(arrString));
        System.out.println("<------------------------->");
        */

        timer.stop();
        System.out.println(timer.toString());
        System.out.println("dice timer que duró: "+timer.elapsedTime());

        //con Bubble: transcurrieron  46 Milisegundos
        //con Heap: transcurrieron  13 Milisegundos
        //con Quick: transcurrieron  19 Milisegundos

    }
    public static void programaTM(){

        Persona persona1 = new Persona("Ana",12);
        Persona persona2 = new Persona("Jose",11);
        Persona persona3 = new Persona("Emanuel",1);
        Persona persona4 = new Persona("Josefina",4);

        Persona[] personas=new Persona[]{persona1,persona2,persona3,persona4};
        System.out.println("sin ordenar:"+ Arrays.toString(personas));
        SortUtil.ordenar(personas);
        System.out.println("Ordenado:"+ Arrays.toString(personas));

        System.out.println("<------------------------->");

        Celular celular1=new Celular("Ana",342);
        Celular celular2=new Celular("Lus",011);
        Celular celular3=new Celular("Pamela",344);
        Celular celular4=new Celular("Juan",15);

        Celular[] celulares=new Celular[]{celular1,celular2,celular3,celular4};
        System.out.println("sin ordenar:"+ Arrays.toString(celulares));
        SortUtil.ordenar(celulares);
        System.out.println("Ordenado:"+ Arrays.toString(celulares));

        System.out.println("<------------------------->");
    }
}
