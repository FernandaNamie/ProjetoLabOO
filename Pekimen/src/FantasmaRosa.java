
public class FantasmaRosa extends Fantasmas {

	FantasmaRosa(int x, int y, String imagePath, ID id, Mapa mapa, Controle controle, String cruzamento) {
		super(x, y, imagePath, id, mapa, controle, cruzamento);
	}

	@Override
	public void tick() {
		super.colisao();
		super.teleporte();
	}
}
