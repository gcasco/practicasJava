package Clase3;

public class Celular implements Precedable<Celular>{
    private int Numero;
    private String Titular;
    public Celular(){};
    public Celular(String titular,int numero){
        this.Numero=numero;
        this.Titular=titular;
    }

    @Override
    public int precedeA(Celular celular) {
        int resultado = Titular.compareToIgnoreCase(celular.Titular);
        return resultado;
    }

    @Override
    public String toString() {
        return "Celular{" +
                "Numero=" + Numero +
                ", Titular='" + Titular + '\'' +
                '}';
    }
}
