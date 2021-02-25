package Clase3;

import java.util.Arrays;

public class program {
    public static void main(String[] args) throws ClassNotFoundException {
        programaTM();
        programaTT();
    }
    public static void programaTT() {
        Object s =  MiFactory.getInstance("sorter");

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
