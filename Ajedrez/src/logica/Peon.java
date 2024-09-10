package logica;

public class Peon extends Movimientos{

	public Peon(int posicionVertical, int posicionHorizontal) {
		super(posicionVertical, posicionHorizontal);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calcularCasillasVertical() {
		int casillas = 0;
		if(posicionVertical == 1) {
			casillas = 2;
		}
		else if(posicionVertical == 8){
			casillas = 0;
		}
		else {
			casillas = 1;
		}
		return casillas;
	}

	@Override
	public int calcularCasillasHorizontal() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int casillasTotales() {
		return calcularCasillasVertical();
	}

}
