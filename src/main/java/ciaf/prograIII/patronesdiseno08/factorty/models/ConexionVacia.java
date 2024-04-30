package ciaf.prograIII.patronesdiseno08.factorty.models;


import ciaf.prograIII.patronesdiseno08.factorty.controllers.IConexion;

public class ConexionVacia implements IConexion {

	@Override
	public void conectar() {
		System.out.println("NO SE ESPECIFIC� PROVEEDOR");		
	}

	@Override
	public void desconectar() {
		System.out.println("NO SE ESPECIFIC� PROVEEDOR");		
	}

}