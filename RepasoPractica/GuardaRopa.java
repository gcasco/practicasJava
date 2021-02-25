package RepasoPractica;

import sun.management.counter.Counter;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRopa {
    private Map<Integer,Prenda[]> dictionary;
    private Integer identificador;

    public GuardaRopa(){
        dictionary=new HashMap<Integer,Prenda[]>();
        identificador=0;
    }

    public Integer guardarPrendas(Prenda[] listaDePrenda){
        identificador=dictionary.size();
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
