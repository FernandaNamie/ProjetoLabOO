
public class FantasmaRosa extends Fantasmas {

	FantasmaRosa(int x, int y, String imagePath, ID id, Mapa mapa, Controle controle) {
		super(x, y, imagePath, id, mapa, controle);
	}

	@Override
	public void tick() {
		super.colisao();
		super.teleporte();
	}
}
