package Clase1y2;

public class Rectangulo extends FiguraGeometrica{
    private double Base;
    private double Altura;

    public Rectangulo(double base,double altura){
        Base=base;
        Altura=altura;
    };
    @Override
    public double area() {
        return Base*Altura;
    }
}
