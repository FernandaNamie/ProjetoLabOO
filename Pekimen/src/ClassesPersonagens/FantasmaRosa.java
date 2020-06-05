package ClassesPersonagens;
import ClassesGerais.Controle;
import ClassesGerais.ID;
import ClassesTabuleiro.Mapa;

public class FantasmaRosa extends Fantasmas {

	public FantasmaRosa(int x, int y, String imagePath, ID id, Mapa mapa, Controle controle, String cruzamento, int VxFantasma,
			int VyFantasma) {
		super(x, y, imagePath, id, mapa, controle, cruzamento, VxFantasma, VyFantasma);
	}

	@Override
	public void tick() {
		super.colisao(this);
		super.teleporte();
	}
}
