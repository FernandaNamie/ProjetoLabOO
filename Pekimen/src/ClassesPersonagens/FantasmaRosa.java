package ClassesPersonagens;

import ClassesGerais.Controle;
import ClassesGerais.ID;

public abstract class FantasmaRosa extends Fantasmas {

	public FantasmaRosa(int x, int y, ID id, Controle controle, String cruzamento, int VxFantasma, int VyFantasma) {
		super(x, y, id, controle, cruzamento, VxFantasma, VyFantasma);
	}
	
	MovimentacaoRosa movimentacao = new MovimentacaoRosa(super.controle, this);
	MovimentacaoGeral geral = new MovimentacaoGeral(super.controle, this);

	@Override
	public void tick() {
		x += VxFantasma;
		y += VyFantasma;
		if (gaiola)
			geral.sairGaiola(this);
		movimentacao.movimentar();
		super.teleporte();
	}
}
