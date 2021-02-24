package Clase1y2;

import java.time.DayOfWeek;
import java.time.Month;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Fecha {
    private DayOfWeek Dia;
    private Month Mes;
    private Year Año;


    public DayOfWeek getDia() {
        return Dia;
    }

    public Month getMes() {
        return Mes;
    }

    public Year getAño() {
        return Año;
    }

    public boolean isValid(Fecha fecha){
        boolean resultado=false;
        //validar
        return resultado;
    }

    public void addDay(int dia){
        if (dia == 0 ||  dia<0) {
            return;
        }

    }

    @Override
    public String toString() {
        return "Fecha{" +
                "Dia=" + Dia +
                ", Mes=" + Mes +
                ", Año=" + Año +
                '}';
    }

    public static void main(String[] args){
        GregorianCalendar calendarExpected = new GregorianCalendar(2018, 4, 30);
        calendarExpected.add(Calendar.DATE, 1);
        System.out.println(calendarExpected.getTime());

    }

    //return "La fecha es: " + fecha.get(Calendar.DAY_OF_MONTH) + "/" + fecha.get(Calendar.MONTH) + "/" + fecha.get(Calendar.YEAR);

}
