package Clase2.TurnoTarde;

public class AreaUtil {
    public static double areaPromedio (FiguraGeometrica arr[]){
        double areas=0;
        for (FiguraGeometrica f:arr) {
            areas+=f.area();
        }

        return (areas/arr.length);
    }
}
