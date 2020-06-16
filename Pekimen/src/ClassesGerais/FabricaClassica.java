package ClassesGerais;

import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import ClassesClassico.CerejaClassico;
import ClassesClassico.FantasmaAzulClassico;
import ClassesClassico.FantasmaLaranjaClassico;
import ClassesClassico.FantasmaRosaClassico;
import ClassesClassico.FantasmaVermelhoClassico;
import ClassesClassico.MusicaClassica;
import ClassesClassico.PacmanClassico;
import ClassesClassico.ParedeClassica;
import ClassesClassico.PastilhaClassica;
import ClassesClassico.PilulaClassica;
import ClassesClassico.PortaoClassico;

public class FabricaClassica extends Fabrica {

	public FabricaClassica(Controle controle, Jogo jogo) {
		super(controle, jogo);

	}

	@Override
	public void fazParedes(int x, int y) throws IOException {
		controle.objetos.add(new ParedeClassica(x, y, ID.Parede, controle, ""));
	}

	@Override
	public void fazPortao(int x, int y) throws IOException {
		controle.objetos.add(new PortaoClassico(x, y, ID.Parede, controle, "U"));
	}

	@Override
	public void fazPastilhas(int x, int y) throws IOException {
		controle.objetos.add(new PastilhaClassica(x, y, ID.Pastilha, controle, ""));
	}
	
	@Override
	public void fazCerejas(int x, int y) throws IOException {
		controle.objetos.add(new CerejaClassico(x, y, ID.Cereja, controle, ""));
	}
	
	@Override
	public void fazPilulas(int x, int y) throws IOException {
		controle.objetos.add(new PilulaClassica(x, y, ID.Pilula, controle, ""));
	}

	@Override
	public void fazPacman(int x, int y) {
		controle.objetos.add(new PacmanClassico(30 * x, 21 * y, ID.Pacman, controle, ""));

	}

	@Override
	public void fazFantasmas(int x, int y, char c) {
		if (c == 'a')
			controle.objetos.add(new FantasmaAzulClassico(30 * x + 4, 21 * y, ID.Fantasma, controle, "", 0, 1));
		if (c == 'v')
			controle.objetos.add(new FantasmaVermelhoClassico(30 * x + 4, 21 * y, ID.Fantasma, controle, "", 0, 0));
		if (c == 'l')
			controle.objetos.add(new FantasmaLaranjaClassico(30 * x + 4, 21 * y, ID.Fantasma, controle, "", 0, -1));
		if (c == 'r')
			controle.objetos.add(new FantasmaRosaClassico(30 * x + 4, 21 * y, ID.Fantasma, controle, "", 0, 0));
	}

	@Override
	public void atualizaFundo() throws IOException  {
		jogo.janela.setImage("Classic/fundo.png");
		
	}

	@Override
	public void fazMusica() throws LineUnavailableException, IOException, UnsupportedAudioFileException {
		jogo.musica = new MusicaClassica();
		
	}
}
