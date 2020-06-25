**Relatório do Projeto**

Para iniciar o projeto, basta executar a classe Main, onde se encontra a main do programa.

Para jogar o jogo, é possível se movimentar tanto a partir das teclas "A" (esquerda), "S" (baixo), "D" (direita) e "W" (cima), quanto as setas do teclado. Para fechar a janela, pode ser pressionada a tecla "ESC" ou selecionando o "X" no canto superior direito. Não é necessário clicar na tela para poder se movimentar.

**Padrão Fábrica Abstrata:** As fábricas de cada "look-and-feel" encontra-se no pacote ClassesGerais, sendo criado um pacote para cada configuração da aparência do jogo. As fábricas são chamadas dentro da classe Menu, que está dentro do pacote ClassesInterface, onde cada botão dentro de Settings determina as aparências do jogo.

**Padrão Strategy:** Encontra-se no pacote ClassesPersonagens, com a interface "MovimentacaoFantasma" implementada em "ChaseAgressive", "ChaseAmbush", "ChaseRandom" e "MovimentacaoGeral", definindo diferentes formas para os fantasminhas se movimentarem.

**Padrão State:** Representado no pacote de "Niveis", onde separamos as caracteristicas dos diferentes estados de acordo com os niveis, ou seja, o nível 1 tem um estado, os níveis 2 a 4 têm outro e os níveis de 5 para cima têm outro. Muda-se a velocidade dos fantasmas, do pacman e a quantidade de "poderes" apresentados no mapa.

**Padrão Decorator:** Utilizado, como instruído, quando o Pacman obtém poderes. Eles estão dentro do pacote de "ClassesPersonagens", e são representados pelo ímã (PacmanColetor; maior alcance de pastilhas) e pela cereja (PacmanRapido; maior velocidade). Para a pílula, como as modificações não ocorrem no Pacman, mais sim nos fantasmas, não é utilizado o padrão Decorator.

14/05: Criada a classe para criar janela do jogo, e configurada para mostrar imagem de fundo. Também foram criadas classes para configurar os objetos do jogo, entretanto nada foi implementado ainda. Foi utilizado como base o vídeo disponibilizado pelo professor na proposta do trabalho e outros sites para incluir a imagem.

15/05: Foi adaptada a geração da janela com imagens de forma a atender requisitos de diferentes sistemas operacionais. Além disso, o programa já é capaz de gerar o labirinto, posicionando cubos para formar as paredes de acordo com um arquivo .txt, o qual também será útil para posicionar os outros itens do mapa e para detectar lugares onde o Pacman não poderá se movimentar. E possibilitamos a mudança de tamanho da janela, entretanto ainda há problemas a serem resolvidos quanto a isso.

17/05: Realizada programação em conjunto entre os membros do grupo por meio de compartilhamento de tela pelo Discord, havendo discussão sobre métodos e solução de problemas que apareceram ao longo do trabalho. Foi implementado o PacMan, de forma que ele é capaz de andar pelo mapa e é capaz de retornar do outro lado ao sair do mapa. Entretanto, não conseguimos ainda determinar quando ele colide contra uma parede e quando "come" uma moedinha. Além disso, tornamos a função resizable da tela novamente para falso. Se formos tratar da mudança de tamanho da janela, será apenas no futuro. Criamos função específica para adaptar paths de documentos para diferentes sistemas operacionais.

18/05: Foi implementado as colisões, possibilitando contar pontos e impedir que o personagem atravesse as paredes.

19/05: Implementação de figuras diferentes para o Pacman, dependendo de qual direção ele está seguindo.

31/05: Implementação de uma classe abstrata para determinar os diferentes fantasmas (cada um recebeu a sua própria classe e imagem, entretanto sem implementar um movimento de verdade). O fantasma é apenas capaz de reconhecer colisão e de teleportar. Há a contagem de vidas no topo da tela agora, e uma tela inicial com dois botões: "Start" e "Settings", este último para poder possibilitar a configuração do fundo de acordo com o tema selecionado, assim como a textura dos bloquinhos possivelmente. Há apenas botões na tela de "Settings", entretanto eles ainda não cumprem as suas funções.

04/06: Atualização do .gitignore, ele estava ignorando coisas que não deveria, assim quando alguém configurava o git no eclipse e importava o projeto, ocorria um erro de leitura. Tentativa de implementar movimento no fantasma vermelho (que segue o Pacman), porém extremamente falha. Reparos no movimento do Pacman, agora ele é capaz de "memorizar" seu próximo movimento, gerando fluidez.

05/06: Realizada a organização das classes em diferentes pacotes, dado o número crescente de classes necessárias. Além disso, foi implementado o padrão fábrica abstrata para os "looks-and-feels", falta apenas implementar o plano de fundo para cada aparência e o caso da selva. Foi gerada a movimentação aleatória para um dos fantasmas.

06/06: Todos os fantasmas agora realizam movimento aleatório, e saem da "gaiola" de acordo com o número de pastilhas comidas pelo Pacman (seguindo o jogo original). Implementada tela de Game Over para quando o Pacman morre definitivamente (perde todas as vidas) e para quando o Pacman come todas as pastilhas do jogo. Quando selecionado o botão Restart o jogo volta para o menu.

07/06: Implementado movimento não aleatório para os fantasmas. Foram criados os movimentos específicos para os fantasmas rosa e vermelho.

08/06: Criada a classe da selva e a sua respectiva fábrica. Agora as imagens de fundo mudam também com a seleção no "Settings".

12/06: Determinados movimentos particulares para cada fantasma de acordo com o padrão Strategy.

14/06: Implementação de música no jogo.

15/06: Criamos o poder da "Cereja", que deixa o pacman momentaneamente mais rápido. Ajustes na música e criada a contagem de níveis.

16/06: Adaptação do poder "Cereja" para se encaixar como decorator, assim como a criação do poder ímã.

20/06: Implementação do padrão State, determinando diferenças entre o nível 1, níveis 2 a 4 e níveis de 5 para cima. Então são modificadas as velocidades do Pacman e dos fantasmas.

21/06: Mudança de fases também modifica o mapa do nível. Início da implementação de fantasmas "comestíveis" quando o Pacman come a pílula, porém movimentação falha.

23/06: Colocada skin para os fantasmas assustados.

25/06: Adaptação dos fantasmas comestíveis para implementar tempo e movimentação aleatória para quando o fantasma fica assustado.
