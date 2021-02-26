package RepasoPractica.Ejercicio1;

public abstract class Prenda {
    private String Marca;
    private String Modelo;

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    @Override
    public String toString() {
        return "Prenda{" +
                "Marca='" + Marca + '\'' +
                ", Modelo='" + Modelo + '\'' +
                '}';
    }
}
