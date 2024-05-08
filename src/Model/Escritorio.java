package Model;

public class Escritorio extends Producto{
    private float alto;
    private float ancho;

    public Escritorio(String nombre, Integer stock, double precio, float alto, float ancho) {
        super(nombre, stock, precio);
        this.alto = alto;
        this.ancho = ancho;
    }

    public float getAlto() {
        return alto;
    }

    public float getAncho() {
        return ancho;
    }

    @Override
    public String toString() {
        return "Informacion de Escritorio: " + "Alto: " + getAlto() + "Ancho:" + getAncho();
    }
}
