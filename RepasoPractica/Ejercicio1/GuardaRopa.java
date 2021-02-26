package RepasoPractica.Ejercicio1;

import java.util.*;

public class GuardaRopa {
    private Map<Integer, Prenda[]> dictionary;
    private Integer identificador;

    public GuardaRopa(){
        dictionary=new HashMap<Integer,Prenda[]>();
        Random aleatorio = new Random(System.currentTimeMillis());
        identificador=aleatorio.nextInt(100);//((int) Math.random()*100);
    }

    public Integer guardarPrendas(Prenda[] listaDePrenda){
        dictionary.put(identificador,listaDePrenda);

        return identificador;
    }

    public void mostrarPrendas(){
        dictionary.forEach((k,v) -> System.out.println("El ID: " +k +"\n    Contiene: "+v.toString()));
    }

    public Prenda[] devolverPrendas(Integer numero){
        return dictionary.get(numero);
    }

}
