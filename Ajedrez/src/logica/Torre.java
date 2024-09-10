package logica;

public class Torre extends Movimientos{

	public Torre(int posicionVertical, int posicionHorizontal) {
		super(posicionVertical, posicionHorizontal);
	}

	@Override
	public int calcularCasillasVertical() {
		
		return 7;
	}

	@Override
	public int calcularCasillasHorizontal() {
		return 7;
	}

	@Override
	public int casillasTotales() {
		// TODO Auto-generated method stub
		return calcularCasillasVertical() + calcularCasillasHorizontal();
	}
	

}
