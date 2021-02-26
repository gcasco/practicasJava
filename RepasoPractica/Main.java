package RepasoPractica;

import RepasoPractica.Ejercicio1.Campera;
import RepasoPractica.Ejercicio1.GuardaRopa;
import RepasoPractica.Ejercicio1.Pantalon;
import RepasoPractica.Ejercicio1.Prenda;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        GuardaRopa guardarRopa= new GuardaRopa();
        Prenda prenda1 = new Campera("Adidas","Z023");
        Prenda prenda2 = new Pantalon("Nike","GO56");
        Prenda[] prendas = new Prenda[]{prenda1,prenda2};
        int ticket = guardarRopa.guardarPrendas(prendas);
        System.out.println("Su ticket de guarda ropas es: " + ticket);

        Prenda[] pedirPrendas = guardarRopa.devolverPrendas(ticket);
        System.out.println("Sus prendas son: "+ Arrays.toString(pedirPrendas));

    }
}
