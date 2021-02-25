package Clase2.TurnoTarde;

public class Circulo extends FiguraGeometrica {
    private double Radio;

    public Circulo(double radio){
        this.Radio=radio;
    };
    @Override
    public double area() {
        double result =Math.PI*Math.pow(Radio,2);
      return result;
    }
}
