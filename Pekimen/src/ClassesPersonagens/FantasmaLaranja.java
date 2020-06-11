package ClassesPersonagens;

import ClassesGerais.Controle;
import ClassesGerais.ID;
import ClassesInterface.HUD;

public abstract class FantasmaLaranja extends Fantasmas {

	public FantasmaLaranja(int x, int y, ID id, Controle controle, String cruzamento, int VxFantasma, int VyFantasma) {
		super(x, y, id, controle, cruzamento, VxFantasma, VyFantasma);
	}
	
	MovimentacaoGeral geral = new MovimentacaoGeral(super.controle, this);
	ChaseRandom aleatorio = new ChaseRandom(super.controle, this);

	@Override
	public void tick() {
		x += VxFantasma;
		y += VyFantasma;
		if (gaiola && HUD.pontos >= pontosIniciais + 600)
			geral.sairGaiola(this);
		else
			geral.movimentacaoGaiola();
		aleatorio.movimentar();
		geral.teleporte();
		geral.movimentar();
	}
}
