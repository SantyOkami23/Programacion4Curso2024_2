package ciaf.prograIII.patronesdiseno08.Observer.controller;

import ciaf.prograIII.patronesdiseno08.Observer.model.PesoARGObservador;
import ciaf.prograIII.patronesdiseno08.Observer.model.PesoMXObservador;
import ciaf.prograIII.patronesdiseno08.Observer.model.SolObservador;
import ciaf.prograIII.patronesdiseno08.Observer.model.Subject;

public class App {

    public static void main(String[] args) {
        Subject subject = new Subject();

        new SolObservador(subject);
        new PesoARGObservador(subject);
        new PesoMXObservador(subject);

        System.out.println("Si desea cambiar 10 dólares obtendrá : ");
        subject.setEstado(10);
        System.out.println("-----------------");
        System.out.println("Si desea cambiar 100 dólares obtendrá : ");
        subject.setEstado(100);
    }
}