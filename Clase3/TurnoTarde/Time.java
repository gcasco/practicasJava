package Clase3.TurnoTarde;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Calendar;

public class Time {
    private long inicio;
    private long fin;
    //private Calendar calendar;

    public Time(){
        inicio=0;
        fin=0;
        //calendar=Calendar.getInstance();

    }

    public void start(){
        inicio= Timestamp.valueOf(LocalDateTime.now()).getTime();
        //long inicioWithCalendar= calendar.getTimeInMillis();
        //System.out.printf("%dy con calendar%d%n", inicio, inicioWithCalendar);
    }
    public void stop(){
        fin= Timestamp.valueOf(LocalDateTime.now()).getTime();
    }
    public long elapsedTime(){
        return (fin-inicio);
    }
    @Override
    public String toString() {
        return "transcurrieron  " + (fin-inicio) +" Milisegundos";
    }
}
