package RepasoPractica.Ejercicio2;

import java.util.Arrays;

public class Carrera {
    private double Distancia;
    private int PremioEnDolares;
    private String Nombre;
    private int CantidadDeVehiculosPermitidos;
    private int CantidadDeVehiculos;
    private Vehiculo[] Vehiculos;
    private SocorristaAuto socorristaAuto;
    private SocorristaMoto socorristaMoto;

    public int getCantidadDeVehiculos() {
        return CantidadDeVehiculos;
    }

    public Carrera(double distancia, int premio, String nombre, int cupo, Vehiculo[] vehiculos){
        if(vehiculos.length>cupo){
            CantidadDeVehiculosPermitidos=vehiculos.length;
        }else {
            CantidadDeVehiculosPermitidos = cupo;
        }
        Distancia=distancia;
        PremioEnDolares=premio;
        Nombre=nombre;
        Vehiculos=vehiculos;
        CantidadDeVehiculos=Vehiculos.length;

    }
    public Carrera(double distancia,int premio,String nombre, int cupo){
        Distancia=distancia;
        PremioEnDolares=premio;
        Nombre=nombre;
        CantidadDeVehiculosPermitidos=cupo;
        CantidadDeVehiculos=0;
        Vehiculos=new Vehiculo[cupo];
    }

    public void setCantidadDeVehiculosPermitidos(int cantidadDeVehiculosPermitidos) {
        CantidadDeVehiculosPermitidos = cantidadDeVehiculosPermitidos;
    }

    public int getCantidadDeVehiculosPermitidos() {
        return CantidadDeVehiculosPermitidos;
    }

    public void darDeAltaAuto(double velocidad, double aceleracion, double anguloDeGiro, String patente){
        if(CantidadDeVehiculosPermitidos > Vehiculos.length){
            Vehiculo nuevoAuto = new Auto(velocidad,anguloDeGiro,patente,aceleracion);
            Vehiculos[CantidadDeVehiculos]=nuevoAuto;
            CantidadDeVehiculos=Vehiculos.length;
        }
        else{
            System.out.println("ERROR! El cupo ya esta lleno");
        }
    }

    public void darDeAltaMoto(double velocidad,double aceleracion,double anguloDeGiro,String patente){
        if(CantidadDeVehiculosPermitidos > Vehiculos.length){
            Vehiculo nuevaMoto = new Moto(velocidad,anguloDeGiro,patente,aceleracion);
            Vehiculos[CantidadDeVehiculos]=nuevaMoto;
            CantidadDeVehiculos=Vehiculos.length;
        }
        else{
            System.out.println("ERROR! El cupo ya esta lleno");
        }
    }

    public void eliminarVehiculo(Vehiculo vehículo){

        for (int i=0;i<Vehiculos.length;i++){
            if(Vehiculos[i].getPatente()==vehículo.getPatente()){
                for (int j=i; j<Vehiculos.length;j++){
                    if(j+1<Vehiculos.length){
                        Vehiculos[j] = Vehiculos[j+1];
                    }
                    else{
                        Vehiculos[j] = new Vehiculo();
                        CantidadDeVehiculos = j;
                    }
                }
            }
        }
    }

    public void eliminarVehiculoConPatente(String unaPatente){

        for (int i=0;i<Vehiculos.length;i++){
            if(Vehiculos[i].getPatente()==unaPatente){
                for (int j=i; j<Vehiculos.length;j++){
                    if(j+1<Vehiculos.length){
                        Vehiculos[j] = Vehiculos[j+1];
                    }
                    else{
                        Vehiculos[j] = new Vehiculo();
                        CantidadDeVehiculos = j;
                    }
                }
            }
        }
    }

    public void printGanador(){
        double max = 0;
        double valVehiculo=0;
        Vehiculo vehiculoGanador=new Vehiculo();

        for (Vehiculo v: Vehiculos) {

            //Velocidad * 1⁄2 Aceleracion / (AnguloDeGiro*(Peso-Cantidad de Ruedas * 100)
            valVehiculo= v.getVelocidad()*0.5*v.getAceleración()/(v.getAnguloDeGiro()*(v.getPeso()-v.getRuedas()*100));

            if(valVehiculo>max){
                max=valVehiculo;
                vehiculoGanador=v;
            }
        }
        System.out.println("El ganador es: "+vehiculoGanador.toString());
    }

    public void socorrerAuto(String patente){
        for (int i=0;i<Vehiculos.length;i++){
            if(Vehiculos[i].getPatente()==patente){
                socorristaAuto.socorrer((Auto) Vehiculos[i]);
            }
        }
    }
    public void socorrerMoto(String patente){
        for (int i=0;i<Vehiculos.length;i++){
            if(Vehiculos[i].getPatente()==patente){
                socorristaMoto.socorrer((Moto) Vehiculos[i]);
            }
        }
    }
}
