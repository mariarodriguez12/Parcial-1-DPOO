package logica;

public class Rey extends Movimientos {

	public Rey(int posicionVertical, int posicionHorizontal) {
		super(posicionVertical, posicionHorizontal);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calcularCasillasVertical() {
		int casillas = 0;
		if(posicionVertical == 1 || posicionVertical == 8) {
			casillas = 1;
		}
		else {
			casillas = 2;
		}
		return casillas;
	}

	@Override
	public int calcularCasillasHorizontal() {
		int casillas = 0;
		if(posicionHorizontal == 1 || posicionHorizontal == 8) {
			casillas = 1;
		}
		else {
			casillas = 2;
		}
		return casillas;
	}

	public int calcularCasillasDiagonal() {
		int casillas = 0;
		if(posicionHorizontal == 1 || posicionHorizontal == 8 && posicionVertical == 1 || posicionVertical == 8) {
			casillas = 1;
		}
		else if(posicionHorizontal == 1 || posicionHorizontal == 8 && posicionVertical != 1 && posicionVertical != 8) {
			casillas = 2;
		}
		
		else if(posicionVertical == 1 || posicionVertical == 8 && posicionHorizontal != 1 && posicionHorizontal != 8) {
			casillas = 2;
		}
		
		else {
			casillas = 4;
		}
		return casillas;
	}
	
	@Override
	public int casillasTotales() {
		// TODO Auto-generated method stub
		return calcularCasillasVertical() + calcularCasillasHorizontal() + calcularCasillasDiagonal();
	}

}
