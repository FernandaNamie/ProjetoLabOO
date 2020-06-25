package ClassesClassico;

import ClassesGerais.Controle;
import ClassesGerais.ID;
import ClassesPersonagens.FantasmaVermelho;

public class FantasmaVermelhoClassico extends FantasmaVermelho {

	public FantasmaVermelhoClassico(int x, int y, ID id, Controle controle, String cruzamento, int VxFantasma,
			int VyFantasma) {
		super(x, y, id, controle, cruzamento, VxFantasma, VyFantasma);
		this.up = "Classic/fantasmaVermelhoU.png";
		this.down = "Classic/fantasmaVermelhoD.png";
		this.left = "Classic/fantasmaVermelhoL.png";
		this.right = "Classic/fantasmaVermelhoR.png";
		this.setImage("Classic/fantasmaVermelhoR.png");
	}
}
