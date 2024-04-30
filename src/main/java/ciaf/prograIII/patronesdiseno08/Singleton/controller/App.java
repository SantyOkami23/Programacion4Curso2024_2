package ciaf.prograIII.patronesdiseno08.Singleton.controller;


import ciaf.prograIII.patronesdiseno08.Singleton.model.Conexion;

public class App {

    public static void main(String[] args) {
        //Instanciacion por constructor prohibido por ser "private"
        //Conexion c = new Conexion();
        Conexion c = Conexion.getInstancia();
        c.conectar();
        c.desconectar();

        // Si tuviera el constructor publico -> Comportamiento cada vez que se genera una conexion
        // Conexion C1 = new Conexion();
        //C1.conectar();
        //C1.desconectar();

        boolean rpta = c instanceof Conexion;
        System.out.println(rpta);
    }

    //Otro ejemplo en: https://www.youtube.com/watch?v=qiFeiYLzIH8
    //Spring Framework gestiona sus beans como Singleton por defecto
}