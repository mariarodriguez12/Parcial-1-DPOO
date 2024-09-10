package Presentacion;

import logica.Movimientos;
import logica.Peon;
import logica.Rey;
import logica.Torre;

public class Consola {

	private Movimientos movimientos;
	
	public Consola() {
		this.movimientos = new Peon(5,6);
		System.out.println(this.movimientos.casillasTotales());
		
		this.movimientos = new Torre(8,4);
		System.out.println(this.movimientos.casillasTotales());
		
		this.movimientos = new Rey(8,1);
		System.out.println(this.movimientos.casillasTotales());
		
	}
	
	public static void main(String[] args) {
		new Consola();
	}

	
}
