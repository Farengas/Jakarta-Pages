package it.cefi.models;

public final class MatematicaBean {

	private MatematicaBean() {}
	
	public static double fattoriale(double numero) {
		return numero == 0 ? 1 : numero * fattoriale(numero - 1);
	}
	
}
