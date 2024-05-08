package Model;

public class Impresora extends Informatico {
    private Integer impXmin;

    public Impresora(String nombre, Integer stock, Double precio, String fabricante, Integer impXmin) {
        super(nombre, stock, precio, fabricante);
        this.impXmin = impXmin;
    }

    public Integer getImpXmin() {
        return impXmin;
    }

    @Override
    public String toString() {
        return "Informacion de Impresora: " + "Impreciones P/Min: " + getImpXmin();
    }
}
