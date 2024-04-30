package ciaf.prograIII.patronesdiseno08.Strategy.model;

import ciaf.prograIII.patronesdiseno08.Strategy.controller.IEstrategia;

public abstract class AnalisisSimple implements IEstrategia {
	
	public void analizar() {
		iniciar();
		saltarZip();
		detener();
	}

	abstract void iniciar();

	abstract void saltarZip();

	abstract void detener();
}