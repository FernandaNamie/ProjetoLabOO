**Relatório do Projeto**

Para iniciar o projeto, basta executar a classe Main, onde se encontra a main do programa.

14/05: Criada a classe para criar janela do jogo, e configurada para mostrar imagem de fundo. Também foram criadas classes para configurar os objetos do jogo, entretanto nada foi implementado ainda. Foi utilizado como base o vídeo disponibilizado pelo professor na proposta do trabalho e outros sites para incluir a imagem.

15/05: Foi adaptada a geração da janela com imagens de forma a atender requisitos de diferentes sistemas operacionais. Além disso, o programa já é capaz de gerar o labirinto, posicionando cubos para formar as paredes de acordo com um arquivo .txt, o qual também será útil para posicionar os outros itens do mapa e para detectar lugares onde o Pacman não poderá se movimentar. E possibilitamos a mudança de tamanho da janela, entretanto ainda há problemas a serem resolvidos quanto a isso.

17/05: Realizada programação em conjunto entre os membros do grupo por meio de compartilhamento de tela pelo Discord, havendo discussão sobre métodos e solução de problemas que apareceram ao longo do trabalho. Foi implementado o PacMan, de forma que ele é capaz de andar pelo mapa e é capaz de retornar do outro lado ao sair do mapa. Entretanto, não conseguimos ainda determinar quando ele colide contra uma parede e quando "come" uma moedinha. Além disso, tornamos a função resizable da tela novamente para falso. Se formos tratar da mudança de tamanho da janela, será apenas no futuro. Criamos função específica para adaptar paths de documentos para diferentes sistemas operacionais.

18/05: Foi implementado as colisões, possibilitando contar pontos e impedir que o personagem atravesse as paredes.