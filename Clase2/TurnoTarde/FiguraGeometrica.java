package Clase2.TurnoTarde;

public abstract class FiguraGeometrica {
    public abstract double area();

    @Override
    public String toString() {
        String msg="Esta es una Figura Goemetrica";
        return msg;
        //no tiene sentido sobreescribir el metodo ToString aqui
    }
}
