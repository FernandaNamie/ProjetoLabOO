package ClassesClassico;

import ClassesGerais.Controle;
import ClassesGerais.ID;
import ClassesPersonagens.FantasmaVermelho;

public class FantasmaVermelhoClassico extends FantasmaVermelho {

	public FantasmaVermelhoClassico(int x, int y, ID id, Controle controle, String cruzamento, int VxFantasma,
			int VyFantasma) {
		super(x, y, id, controle, cruzamento, VxFantasma, VyFantasma);
		this.imagePath = "Classic/fantasmaVermelho.png";
		this.ajustaTextura();
	}

}
