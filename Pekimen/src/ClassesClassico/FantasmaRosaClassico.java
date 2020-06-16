package ClassesClassico;

import ClassesGerais.Controle;
import ClassesGerais.ID;
import ClassesPersonagens.FantasmaRosa;

public class FantasmaRosaClassico extends FantasmaRosa {

	public FantasmaRosaClassico(int x, int y, ID id, Controle controle, String cruzamento, int VxFantasma,
			int VyFantasma) {
		super(x, y, id, controle, cruzamento, VxFantasma, VyFantasma);
		this.up = "Classic/fantasmaRosaU.png";
		this.down = "Classic/fantasmaRosaD.png";
		this.left = "Classic/fantasmaRosaL.png";
		this.right = "Classic/fantasmaRosaR.png";
		this.setImage("Classic/fantasmaRosaR.png");
	}

}
