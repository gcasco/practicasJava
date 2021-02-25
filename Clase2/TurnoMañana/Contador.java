package Clase2.TurnoMañana;

public class Contador {
    private int Valor;
    public Contador(){};
    public Contador(int value){
        Valor=value;
    }
    public Contador(Contador contador){
       Valor=contador.Valor;
    }

    public void setValor(int valor) {
        Valor = valor;
    }

    public int getValor() {
        return Valor;
    }

    public void decrementar(int decremento){
        setValor(getValor()-decremento);
        System.out.println(getValor());
    }

    public void incrementar(int incremento){
        setValor(getValor()+incremento);
        System.out.println(getValor());
    }
}
