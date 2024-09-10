package logica;

public abstract class Movimientos {
	protected int posicionVertical;
	protected int posicionHorizontal;
	public static int dimension = 8;
			
	public int getposicionVertical() {
		return posicionVertical;
	}

	public void setposicionVertical(int posicionVertical) {
		this.posicionVertical = posicionVertical;
	}

	public Movimientos(int posicionVertical, int posicionHorizontal) {
		this.posicionVertical = posicionVertical;
		this.posicionHorizontal = posicionHorizontal;
	}
	
	public int getposicionHorizontal() {
		return posicionHorizontal;
	}

	public void setposicionVHorizontal(int posicionHorizontal) {
		this.posicionHorizontal = posicionHorizontal;
	}
	
	
	public abstract int calcularCasillasVertical();
	public abstract int calcularCasillasHorizontal();
	public abstract int casillasTotales();
}
