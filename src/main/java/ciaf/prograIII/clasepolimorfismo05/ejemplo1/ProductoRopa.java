package ciaf.prograIII.clasepolimorfismo05.ejemplo1;

import ciaf.prograIII.clasepolimorfismo05.ejemplo1.Producto;

class ProductoRopa extends Producto {
    private int cantidad;

    public ProductoRopa(String nombre, double precio, int cantidad) {
        super(nombre, precio);
        this.cantidad = cantidad;
    }

    // Método para calcular el precio total del producto basado en la cantidad
    @Override
    public double calcularPrecioTotal() {
        return precio * cantidad;
    }
}