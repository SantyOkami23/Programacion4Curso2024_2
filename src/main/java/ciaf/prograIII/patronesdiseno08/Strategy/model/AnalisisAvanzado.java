package ciaf.prograIII.patronesdiseno08.Strategy.model;

import ciaf.prograIII.patronesdiseno08.Strategy.controller.IEstrategia;

public abstract class AnalisisAvanzado implements IEstrategia {

	public void analizar() {
		iniciar();
		analizarMemoria();
		analizarKeyloggers();
		analizarRootKits();
		descomprimirZip();
		detener();
	}

	abstract void iniciar();

	abstract void analizarMemoria();

	abstract void analizarKeyloggers();
	
	abstract void analizarRootKits();
	
	abstract void descomprimirZip();	

	abstract void detener();
}