package Clase1y2;

public class Libro {
    private int IdLibro;
    private boolean Prestado; ;
    private String Titulo;
    private String Autor;

    public Libro(){};
    public Libro(int idLibro,boolean prestado, String titulo, String autor){
        this.IdLibro=idLibro;
        this.Titulo=titulo;
        this.Prestado=prestado;
        this.Autor=autor;
    };

    public void setAutor(String autor) {
        Autor = autor;
    }

    public void setIdLibro(int idLibro) {
        IdLibro = idLibro;
    }

    public void setPrestado(boolean prestado) {
        Prestado = prestado;
    }

    public boolean isPrestado() {
        return Prestado;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public int getIdLibro() {
        return IdLibro;
    }

    public String getAutor() {
        return Autor;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void prestamo(boolean prestado){

    };
    public void devolucion(){};

    @Override
    public String toString(){
        return "Id: "+IdLibro+ " Titulo: "+Titulo+" Autor: "+Autor +" En prestamo: "+Prestado;
    };

}
