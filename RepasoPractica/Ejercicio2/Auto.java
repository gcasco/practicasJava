package RepasoPractica.Ejercicio2;

public class Auto extends Vehiculo{

    public Auto(double velocidad, double anguloGiro,String patente,double aceleracion){
        setAceleración(aceleracion);
        setPatente(patente);
        setPeso(1000);
        setRuedas(4);
        setAnguloDeGiro(anguloGiro);
        setVelocidad(velocidad);
    }
}
