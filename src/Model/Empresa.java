package Model;

import Interface.IDesc;

import java.util.ArrayList;

public class Empresa implements IDesc{
    private ArrayList<Producto> productos;

    public Empresa() {
        this.productos = new ArrayList<>();
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    @Override
    public String toString() {
        return "Informacion de la Empresa: " + "Productos:" + getProductos();
    }

    public void subirPrecio() {
        for (int i = 0; i <productos.size(); i++) {     //UTILIZO EL FOR PARA RECORRER EL ARRAY DE PRODUCTOS
            Producto p = productos.get(i);              //CREO UNA VARIABLE AUXILIAR PARA OBTENER EL OBJETO DE LA POSICION I
                    switch (p.getClass().getSimpleName()) { //OBTENGO LA SUBCLASE QUE ALMACENA P PARA APLICAR EL DESCUENTO SEGUN SE INDIQUE
                        case "Silla":
                            System.out.println(p.getPrecio());
                            p.setPrecio(p.getPrecio() + p.getPrecio() / 100 *5);
                            System.out.println(p.getPrecio());
                            break;
                        case "Escritorio":
                            System.out.println(p.getPrecio());
                            p.setPrecio(p.getPrecio() + p.getPrecio() / 100 * 10);
                            System.out.println(p.getPrecio());
                            break;
                        case "Impresora":
                            System.out.println(p.getPrecio());
                            p.setPrecio(p.getPrecio() + p.getPrecio() / 100 * 15);
                            System.out.println(p.getPrecio());
                            break;
                        case "Notebook":
                            System.out.println(p.getPrecio());
                            p.setPrecio(p.getPrecio() + p.getPrecio() / 100 * 20);
                            System.out.println(p.getPrecio());
                            break;
                    }
        }
    }

    @Override
    public void aplicarDesc(Float porcentaje) {
        Double precioDescuento = null; //AUXILIAR QUE CONTENDRA EL PRECIO DESCONTADO
        for (int i=0; i<productos.size();i++){
            Producto p = productos.get(i);
            if (p.getClass().getSimpleName().equalsIgnoreCase("Silla") || p.getClass().getSimpleName().equalsIgnoreCase("Impresora")){ //MISMA COMPARACION QUE EN LA FUNCION SUBIR PRECIOS
               precioDescuento = p.getPrecio() - p.getPrecio() / 100 * porcentaje;                                                                             // APLICADA SOLO A SILLAS E IMPRESORAS
                System.out.println("Precio con descuento de " + p.getClass().getSimpleName() + ":" + precioDescuento);
            }
        }
    }
}
