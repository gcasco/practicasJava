package RepasoPractica;

public abstract class Prenda {
    private String Marca;
    private String Modelo;

    @Override
    public String toString() {
        return "Prenda{" +
                "Marca='" + Marca + '\'' +
                ", Modelo='" + Modelo + '\'' +
                '}';
    }
}
