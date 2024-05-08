package Model;

public class Silla extends Producto{
    private boolean ruedas;

    public Silla( String nombre, Integer stock, double precio, boolean ruedas) {
        super(nombre,stock, precio);
        this.ruedas = ruedas;
    }

    public boolean isRuedas() {
        return ruedas;
    }

    @Override
    public String toString() {
        return "Informacion de Silla:" + "Ruedas: " + isRuedas();
    }


}
