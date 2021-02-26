package RepasoPractica.Ejercicio2;

public class Vehiculo {
    private double Velocidad;
    private double AnguloDeGiro;
    private String Patente;
    private double Aceleración;
    private double Peso;
    private int Ruedas;

    public double getAceleración() {
        return Aceleración;
    }

    public void setAceleración(double aceleración) {
        Aceleración = aceleración;
    }

    public String getPatente() {
        return Patente;
    }

    public void setPatente(String patente) {
        Patente = patente;
    }

    public double getAnguloDeGiro() {
        return AnguloDeGiro;
    }

    public void setAnguloDeGiro(double anguloDeGiro) {
        AnguloDeGiro = anguloDeGiro;
    }

    public void setVelocidad(double velocidad) {
        Velocidad = velocidad;
    }

    public double getVelocidad() {
        return Velocidad;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double peso) {
        Peso = peso;
    }

    public Integer getRuedas() {
        return Ruedas;
    }

    public void setRuedas(Integer ruedas) {
        Ruedas = ruedas;
    }
}
