package ciaf.prograIII.patronesdiseno08.Strategy.controller;


import ciaf.prograIII.patronesdiseno08.Strategy.model.AntivirusAvanzado;

public class App {
	
	public static void main(String[] args) {
		Contexto contexto = new Contexto(new AntivirusAvanzado());
		contexto.ejecutar();
	}

}