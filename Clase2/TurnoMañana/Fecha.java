package Clase2.TurnoMañana;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha {
    private int Dia;
    private int Mes;
    private int Año;

    public boolean isValid(){
        boolean valid = false;

        LocalDate.parse(""+Dia+"-"+Mes+"-"+Año,
                DateTimeFormatter.ofPattern("d-M-uuuu")
                        .withResolverStyle(ResolverStyle.STRICT)
        );

        return valid;
    }
    public void addDay(){
        Calendar.getInstance().add(Dia,1);
    }
    public int getDia() {
        return Dia;
    }

    public int getMes() {
        return Mes;
    }

    public int getAño() {
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
