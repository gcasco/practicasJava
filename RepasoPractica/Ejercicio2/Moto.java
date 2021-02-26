package RepasoPractica.Ejercicio2;

public class Moto extends Vehiculo{

    public Moto(double velocidad, double anguloGiro,String patente,double aceleracion){
        setAceleración(aceleracion);
        setPatente(patente);
        setPeso(300);
        setRuedas(2);
        setAnguloDeGiro(anguloGiro);
        setVelocidad(velocidad);
    }
}
