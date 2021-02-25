package Clase2.TurnoTarde;

import Clase2.TurnoTarde.FiguraGeometrica;

public class Rectangulo extends FiguraGeometrica {
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
