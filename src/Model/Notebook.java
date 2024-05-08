package Model;

public class Notebook extends Informatico{
    private Integer memoria;

    public Notebook(String nombre, Integer stock, Double precio, String fabricante, Integer memoria) {
        super(nombre, stock, precio, fabricante);
        this.memoria = memoria;
    }

    public Integer getMemoria() {
        return memoria;
    }

    @Override
    public String toString() {
        return "Informacion de Notebook:" + "Memoria: " + getMemoria() + "GB";
    }
}
