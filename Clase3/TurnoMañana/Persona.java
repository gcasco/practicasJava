package Clase3.TurnoMañana;

public class Persona implements Precedable<Persona> {
    private String Nombre;
    private int Dni;




    public int getDni() {
        return Dni;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setDni(int dni) {
        this.Dni = dni;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public  Persona () { }
    public Persona(String nombre, int dni){
        this.Nombre=nombre;
        this.Dni=dni;
    }
    public Persona(Persona persona){
        this.Nombre=persona.getNombre();
        this.Dni=persona.getDni();
    }

    @Override
    public String toString() {
        return "Persona{" +
                "Nombre='" + Nombre + '\'' +
                ", Dni=" + Dni +
                '}';
    }

    @Override
    public int precedeA(Persona persona) {
        int precede=0;
        if(Dni> persona.Dni){
            precede=1;
        }else if(Dni<persona.Dni){
            precede=-1;
        }

        return precede;
    }
}
