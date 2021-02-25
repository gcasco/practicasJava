package Clase2.TurnoTarde;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class Program {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IOException, IllegalAccessException, InvocationTargetException, InstantiationException {
        FiguraGeometrica circulo=new Circulo(4);
        System.out.println("El area del circulo es: "+circulo.area());

        FiguraGeometrica rectangulo = new Rectangulo(2,5);
        System.out.println("El area del rectangulo es: "+rectangulo.area());

        FiguraGeometrica triangulo = new Triangulo(3,6);
        System.out.println("El area del triangulo es: "+triangulo.area());

        FiguraGeometrica[] fuguras = new FiguraGeometrica[]{circulo,rectangulo,triangulo};

        System.out.println("El area promedio es: "+ AreaUtil.areaPromedio(fuguras));

    }
}
