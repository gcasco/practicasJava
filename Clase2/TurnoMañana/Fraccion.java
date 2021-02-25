package Clase2.TurnoMañana;

public class Fraccion {
    private int Numerador;
    private int Denominador;
    private double Valor;

    public Fraccion(){};

    public Fraccion(int numerador, int denominador){
        this.Numerador=numerador;
        this.Denominador=denominador;
        this.Valor=(double) numerador/denominador;
    }

    public double getValor() {
        return Valor;
    }

    public int getDenominador() {
        return Denominador;
    }

    public int getNumerador() {
        return Numerador;
    }

    public void setDenominador(int denominador) {
        Denominador = denominador;
    }

    public void setNumerador(int numerador) {
        Numerador = numerador;
    }

    //Metodos de clase
    public Fraccion sumar(Fraccion fraccion){
        Fraccion c=new Fraccion();
        c.setNumerador(getNumerador()*fraccion.getDenominador()+fraccion.getNumerador()*getDenominador());
        c.setDenominador(getDenominador()*fraccion.getDenominador());
        return c;
    }
    public Fraccion sumar(int entero){
        Fraccion c=new Fraccion();
        c.setNumerador(getNumerador()*entero+1*getDenominador());
        c.setDenominador(getDenominador());
        return c;
    }

    public Fraccion restar(Fraccion fraccion){
        Fraccion c=new Fraccion();
        c.setNumerador(getNumerador()*fraccion.getDenominador()-fraccion.getNumerador()*getDenominador());
        c.setDenominador(getDenominador()*fraccion.getDenominador());
        return c;
    }
    public Fraccion restar(int entero){
        Fraccion c=new Fraccion();
        c.setNumerador(getNumerador()*entero-1*getDenominador());
        c.setDenominador(getDenominador());
        return c;
    }

    public Fraccion multiplicar(Fraccion fraccion){
        Fraccion c=new Fraccion();
        c.setNumerador(getNumerador()*fraccion.getNumerador());
        c.setDenominador(getDenominador()*fraccion.getDenominador());
        return c;
    }
    public Fraccion multiplicar(int entero){
        Fraccion c=new Fraccion();
        c.setNumerador(getNumerador()*entero);
        c.setDenominador(getDenominador());
        return c;
    }

    public Fraccion dividir(Fraccion fraccion){
        return new Fraccion(getNumerador()*fraccion.getDenominador(), getDenominador()*fraccion.getNumerador());
    }
    public Fraccion dividir(int entero){
        return new Fraccion(getNumerador(), getDenominador()*entero);
    }

}
