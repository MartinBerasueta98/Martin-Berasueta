package Model;

public abstract class Producto{ //PRODUCTOS ES ABSTRACTA YA QUE SOLO ES UTILIZADA COMO "PLANTILLA" PARA LAS SUBCLASES
    private String nombre;
    private Integer stock;
    private Double precio;

    public Producto(String nombre, Integer stock, double precio) {
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getStock() {
        return stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Informacion de Productos: " + "Nombre: " + getNombre() + "Stock: " + getStock() + "Precio: " + getPrecio();
    }
}
