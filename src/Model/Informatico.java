package Model;

public class Informatico extends Producto{
    private String fabricante;

    public Informatico(String nombre, Integer stock, Double precio, String fabricante) {
        super(nombre, stock, precio);
        this.fabricante = fabricante;
    }

    public String getFabricante() {
        return fabricante;
    }

    @Override
    public String toString() {
        return "Informacion de Productos Informaticos: " + "Fabricante:" + getFabricante();
    }
}
