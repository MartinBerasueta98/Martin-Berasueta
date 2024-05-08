import Model.*;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();// CREACION DE LA CLASE CONTENEDORA
        empresa.getProductos().add(new Silla("Silla", 3, 400D, false));
        empresa.getProductos().add(new Escritorio("Escritorio", 1, 5000D, 0.50F, 1.75F));
        empresa.getProductos().add(new Notebook("Notebook", 5, 100000D, "Asus", 16));
        empresa.getProductos().add(new Impresora("Impresora", 2, 30000D, "Epson", 35));
        System.out.println(empresa); //MUESTRA EL CONTENIDO DE LOS PRODUCTOS(PUNTO 3)
        empresa.aplicarDesc(6.75F);// APLICAMOS UN DESCUENTO DE 6.75% (PUNTO 4)
        empresa.subirPrecio();// SUBIMOS PRECIOS SEGUN INDICA EL INCISO 5

    }
}