package Clase1y2;

public class Triangulo extends FiguraGeometrica{
    private double Base;
    private double Altura;

    public Triangulo(double base,double altura){
        Base=base;
        Altura=altura;
    }

    @Override
    public double area() {
        return (Base*Altura/2);
    }
}
