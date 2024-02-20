package ciaf.prograIII.claseciclosycondicionales02;

public class EjemploMatriz2 {
    // Definición de productos con sus respectivas restricciones de edad
    private static String[][] productos = {
            {"Laptop", null},
            {"Smartphone", null},
            {"Videojuego", "18"},
            {"Cámara", null},
            {"Auriculares", null}
    };

    // Función para verificar si un cliente puede comprar un producto según su edad
    private static boolean puedeComprar(Integer edadCliente, String restriccionEdad) {
        if (restriccionEdad == null) {
            return true; // No hay restricciones de edad para este producto
        } else if (edadCliente == null) {
            return false; // No se conoce la edad del cliente
        } else {
            try {
                int restriccion = Integer.parseInt(restriccionEdad);
                return edadCliente >= restriccion;
            } catch (NumberFormatException e) {
                // En caso de que la restricción de edad no sea un número válido
                return false;
            }
        }
    }

    public static void main(String[] args) {
        // Simulación de una lista de productos que un cliente quiere comprar
        String[] productosComprar = {"Laptop", "Smartphone", "Videojuego", "Cámara", "Auriculares"};

        // Edad del cliente (puede ser null si no se conoce)
        Integer edadCliente = 25;

        // Verificación de cada producto en la lista de compras
        for (String[] producto : productos) {
            String nombreProducto = producto[0];
            String restriccionEdad = producto[1];
            if (puedeComprar(edadCliente, restriccionEdad)) {
                System.out.println("El cliente puede comprar " + nombreProducto);
            } else {
                System.out.println("El cliente no puede comprar " + nombreProducto + " debido a restricciones de edad");
            }
        }
    }
}
