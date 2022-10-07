package Jogo;


import java.util.Scanner;

 class JogoDeTextos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.println("Ola! Qual seu nome?");
        String nome = input.nextLine();
        System.out.println("Muito prazer " + nome + "");
        System.out.println("Eu vou ser o seu narrador hoje...");
        System.out.println("Nao vamos ficar falando sobre mim, qual sua idade? quero te conhecer melhor.");
        int idade = entrada.nextInt();
        if (idade > 18) {
            System.out.println("Voce ja pode ser preso, e bom eu anotar isso...");
        }
        if (idade < 18) {
            System.out.println("Voce ainda uma crianca");
        }
        System.out.println("espero que esteja pronto para  embarcar nessa aventura.");
        System.out.println("Voce esta em uma sala escura. E nela voce tem uma vela, uma chave, e um colar.");
        System.out.println("Na sua esquerda ha uma porta semi aberta.");
        System.out.println("Do outro lado da porta voce ouve uns barulhos estranhos...");
        System.out.println("Voce gostaria de abrir a porta?");
        System.out.println("1. SIM");
        System.out.println("2. NAO");
        int porta = entrada.nextInt();
        switch (porta) {
            case 1:
                System.out.println("Voce vai sair sem os itens?");
                System.out.println("OK... o que voce deseja fazer?");

            case 2:
                System.out.println("1. PEGAR ITENS?");
                int op = entrada.nextInt();
                switch (op) {
                    case 1:
                        System.out.println("Voce pegou uma vela, uma chave, e um colar");
                        System.out.println("Agora voce deseja abrir a porta?");
                        System.out.println("1. ABRIR");
                        int abrir = entrada.nextInt();
                    case 2:
                        System.out.println("*abrindo*");
                }
        }
        System.out.println("Agora com os itens em maos...");
        System.out.println(" A sala esta toda escura, vejo que pegou uma vela. tente acender a luz");
        System.out.println("1. ACENDER A LUZ");
        int vela = entrada.nextInt();
        switch (vela) {
            case 1:
                System.out.println("Como voce vai ascender a vela sendo que nao possui fosforo ?");
                break;
        }
        System.out.print("PROCURE POR UM INTERRUPTOR");
        System.out.print("... ... ... ...");
        System.out.println(" *click* ");
        System.out.println("Voce conseguiu ! mas parece que estamos sem energia eletrica...");
        System.out.print("Espera...");
        System.out.print(" Voce tambem percebeu? ");
        System.out.println(" As conversas pararam ");
        System.out.println("Enfim voce agora tem um corredor escuro com varias portas.");
        System.out.println("Nessas portas estao enumeradas e esses numeros brilham?");
        System.out.println("O que voce ira fazer ?");
        System.out.println("...");
        System.out.println("...");
        System.out.println("...");
        System.out.println("Voce possui uma chave ja pensou em usar em alguma das portas?");
        System.out.println("1. USAR CHAVE NA PORTA.");
        int evento1 = entrada.nextInt();
        System.out.println("v-voce ouviu isso?  RAPIDO CORRE!  PORQUE VOCE ESTA PARADO?");
        System.out.println("1.CORRER");
        int correr = entrada.nextInt();
        switch (correr) {
            case 1:
                System.out.println("Voce corre ate o quarto inicial.");
                break;
            default:
                System.out.println("Voce e mordido e suas entranhas estao todas expostas no chao, a fera devora lentamente seus membros e voce consegue sentir dor enquanto fecha os olhos lentamente.");
        }
        System.out.println("Certo...  Parece que aquilo ja passou...    Mas o que era aquilo?");
        System.out.println("1. Eu nao sei");
        System.out.println("2. Parece ser uma fera");
        int fera = entrada.nextInt();
        switch (fera) {
            case 1:
                System.out.println("Eu tambem nunca ouvi isso antes");
                break;
            case 2:
                System.out.println("Parecia ser um bixo enorme rosnando muito alto pronto para nos estraçalhar.");
                break;
            default:
                System.out.println("Assustador...");
        }
        System.out.println("Voce ja procurou no chao para ver se tem algum fosfoto?");
        System.out.println("1. BOA IDEIA !");
        System.out.println("2. Ainda nao");
        System.out.println("3. PROCURAR");
        int ideia = entrada.nextInt();
        switch (ideia) {
            case 1:
                System.out.println("hm...  nada aqui...  lixo...  hmm....");
            default:
                System.out.println("Voce achou ... um graveto?");
        }
        System.out.println("Continue a procurar esta muito escuro aqui...");
        System.out.println("Voce achou... outro graveto... legal vai fazer uma fogueira neste quarto agora?");
        System.out.println("Espera... esse graveto...    quebra ele...");
        System.out.println("*creck* ... Voce viu isso? ele esta brilhando...");
        System.out.println("Saia para explorar, acho que agora esta seguro...");
        System.out.println("1. SAIR");
        System.out.println("2. FICAR");
        int sair = entrada.nextInt();
        switch (sair) {
            case 1:
                System.out.println("*saindo para explorar*");
                break;
            default:
                System.out.println("Nao precisa ter medo, nao da mais para ouvir a fera.   *saindo para explorar*");
        }
        System.out.println("Voce saiu para fora do quarto novamente...  agora podendo os seus pes e um metro a sua frente...");
        System.out.println("Os numeros quando voce aproxima o seu pau...     isso foi indecente, desculpe...    o pau brilhante, ele muda de cor...");
        System.out.println("Espere...   que cor e a chave que voce pegou?   tente colocar na porta da mesma cor");
        System.out.println("1. COLOCAR CHAVE NA PORTA VERDE");
        System.out.println("2. COLOCAR CHAVE NA PORTA AZUL");
        System.out.println("3. COLOCAR CHAVE NA PORTA VERMELHA");
        int chave = entrada.nextInt();
        switch (chave) {
            case 1:
                System.out.println("Nao esta entrando... tente em outra porta");
                System.out.println("2. COLOCAR CHAVE NA PORTA AZUL");
                int outra = entrada.nextInt();
            case 2:
                System.out.println("Tem certeza que voce esta vendo a cor certa da porta?");
                System.out.println("voce e dautonico ne ? coloque na ultima porta do corredor.");
                System.out.println("1. COLOCAR CHAVE NA PORTA VERMELHA");
                int verme = entrada.nextInt();
            default:
                System.out.println("Voce conseguiu destrancar a porta, abra com cuidado... nao sabemos o que tem do outro lado.");
        }
        System.out.println("*voce abriu a porta e encontrou a fera...*");
        System.out.println("ela esta dormindo?");
        System.out.println("A fera possui garras enormes, dentes maiores ainda...");
        System.out.println("Ela guarda uma porta semi aberta, mas voce nao consegue enxergar nada la dentro...");
        System.out.println("Essa criatura deve ter uns 4 metros...        O que voce vai fazer?");
        System.out.println("1. SAIR");
        System.out.println("2. CAMINHAR EM DIRECAO A PORTA");
        int decisao = entrada.nextInt();
        switch (decisao) {
            case 1:
                System.out.println("Se voce sair agora, provavemente a fera vai acordar faminta e vai ir atras de voce...   *caminhar ate a porta*");
                break;
            case 2:
                System.out.println("*caminhando cuidadosamente...*");
        }
        System.out.println("Voce da um passo em falso e acaba de torcer o seu pe... mas por sorte voce nao fez nenhum barulho que acordasse a fera.     *voce nao pode mais correr...* ");
        System.out.println("A luz do pedaco de pau se apagou de vez...  acho melhor nao usar outro para nao fazer barulho...");
        System.out.println("ESPERA ... tive uma ideia, abra bem a porta e jogue esse pedaco de pau que acabou para fora da sala...           Assim ela vai para fora ver o barulho e voce fecha a porta...");
        System.out.println("1. JOGAR O PAU FORA");
        int pau = entrada.nextInt();
        switch (pau) {
            case 1:
                System.out.println("Voce joga com toda a sua força o pedaco de pau e a fera acorda...");
            default:
                System.out.println("A fera acorda te ve e te devora por completo sem dar chances de voce fugir...");
        }
        System.out.println("A fera começa a rosnar e vai em direcao ao pedaco de pau...");
        System.out.println("No momento em que a fera vai sair para fora...  voce conseguiu ver no pescoco dessa fera uma marca...");
        System.out.println("Marca como se fosse de uma brasa apagada em volta do pescoco");
        System.out.println("Voce rapidamente fecha a porta");
        System.out.println("E agora?? o que voce vai fazer?");
        System.out.println("1. Procurar alguma arma contra a fera");
        System.out.println("2. Correr para a porta semi aberta");
        int decisao2 = entrada.nextInt();
        switch (decisao2) {
            case 1:
                System.out.println("Voce procura algo... Mas nao consegue encontrar, acho melhor ir para a porta semi aberta");
            case 2:
                System.out.println("Voce corre em direcao a porta... ESPERA... QUE BARULHO FOI E...");
        }
        System.out.println("Voce morreu... a fera viu que voce ia abrir a porta e te abocanhou no meio com uma so dentada... ");
        System.out.println("Ela te partiu em duas partes...     suas entradas todas vazaram pelo chao...    a porta ficou completamente cheia de sangue...");
        System.out.println("Voce gostaria de reiniciar o jogo ?");
        System.out.println("1. SIM");
        int sim = entrada.nextInt();
        switch (sim) {
            case 1:
                System.out.println("Entao la vamos nos...");
                break;
            default:
                System.out.println("Sempre soube que voce nao seria capaz... mas mesmo assim vou te castigar o jogo ira reiniciar...");
        }
        System.out.println("Ola! Qual seu nome?");
        String nome2 = input.nextLine();
        System.out.println("Muito prazer " + nome2 + ", me chamo TMASKI, estranho ne? mas pode me chamar de Boo.");
        System.out.println("Eu vou ser o seu narrador hoje...");
        System.out.println("Nao vamos ficar falando sobre mim, qual sua idade? quero te conhecer melhor.");
        int idade2 = entrada.nextInt();
        if (idade2 > 18) {
            System.out.println("Voce ja pode ser preso, e bom eu anotar isso...");
        }
        if (idade2 < 18) {
            System.out.println("Voce ainda uma crianca");
        }
        System.out.println("espero que esteja pronto para  embarcar nessa aventura.");
        System.out.println("Voce esta em uma sala escura. E nela voce tem uma vela, uma chave, e um colar.");
        System.out.println("Na sua esqurda ha uma porta semi aberta.e");
        System.out.println("Do outro lado da porta voce ouve uns barulhos estranhos...");
        System.out.println("Voce gostaria de abrir a porta?");
        System.out.println("1. SIM");
        System.out.println("2. NAO");
        int porta2 = entrada.nextInt();
        switch (porta2) {
            case 1:
                System.out.println("Voce vai sair sem os itens?");
                System.out.println("OK... o que voce deseja fazer?");

            case 2:
                System.out.println("1. PEGAR ITENS?");
                int op = entrada.nextInt();
                switch (op) {
                    case 1:
                        System.out.println("Voce pegou uma vela, uma chave, e um colar");
                        System.out.println("Agora voce deseja abrir a porta?");
                        System.out.println("1. ABRIR");
                        int abrir = entrada.nextInt();
                    case 2:
                        System.out.println("*abrindo*");
                }
        }
        System.out.println("Agora com os itens em maos...");
        System.out.println(" A sala esta toda escura, vejo que pegou uma vela. tente acender a luz");
        System.out.println("1. ACENDER A LUZ");
        int vela2 = entrada.nextInt();
        switch (vela2) {
            case 1:
                System.out.println("Como voce vai ascender a vela sendo que nao possui fosforo ?");
                break;
        }
        System.out.print("PROCURE POR UM INTERRUPTOR");
        System.out.print("... ... ... ...");
        System.out.println(" *click* ");
        System.out.println("Voce conseguiu ! mas parece que estamos sem energia eletrica...");
        System.out.print("Espera...");
        System.out.print(" Voce tambem percebeu? ");
        System.out.println(" As conversas pararam ");
        System.out.println("Enfim voce agora tem um corredor escuro com varias portas.");
        System.out.println("Nessas portas estao enumeradas e esses numeros brilham?");
        System.out.println("O que voce ira fazer ?");
        System.out.println("...");
        System.out.println("...");
        System.out.println("...");
        System.out.println("Voce possui uma chave ja pensou em usar em alguma das portas?");
        System.out.println("1. USAR CHAVE NA PORTA.");
        int evento2 = entrada.nextInt();
        System.out.println("v-voce ouviu isso?  RAPIDO CORRE!  PORQUE VOCE ESTA PARADO?");
        System.out.println("1.CORRER");
        int correr2 = entrada.nextInt();
        switch (correr2) {
            case 1:
                System.out.println("Voce corre ate o quarto inicial.");
                break;
            default:
                System.out.println("Voce e mordido e suas entranhas estao todas expostas no chao, a fera devora lentamente seus membros e voce consegue sentir dor enquanto fecha os olhos lentamente.");
        }
        System.out.println("Certo...  Parece que aquilo ja passou...    Mas o que era aquilo?");
        System.out.println("1. Eu nao sei");
        System.out.println("2. Parece ser uma fera");
        int fera2 = entrada.nextInt();
        switch (fera2) {
            case 1:
                System.out.println("Eu tambem nunca ouvi isso antes");
                break;
            case 2:
                System.out.println("Parecia ser um bixo enorme rosnando muito alto pronto para nos estraçalhar.");
                break;
            default:
                System.out.println("Assustador...");
        }
        System.out.println("Voce ja procurou no chao para ver se tem algum fosfoto?");
        System.out.println("1. BOA IDEIA !");
        System.out.println("2. Ainda nao");
        System.out.println("3. PROCURAR");
        int ideia2 = entrada.nextInt();
        switch (ideia2) {
            case 1:
                System.out.println("hm...  nada aqui...  lixo...  hmm....");
            default:
                System.out.println("Voce achou ... um graveto?");
        }
        System.out.println("Continue a procurar esta muito escuro aqui...");
        System.out.println("Voce achou... outro graveto... legal vai fazer uma fogueira neste quarto agora?");
        System.out.println("Espera... esse graveto...    quebra ele...");
        System.out.println("*creck* ... Voce viu isso? ele esta brilhando...");
        System.out.println("Saia para explorar, acho que agora esta seguro...");
        System.out.println("1. SAIR");
        System.out.println("2. FICAR");
        int sair2 = entrada.nextInt();
        switch (sair2) {
            case 1:
                System.out.println("*saindo para explorar*");
                break;
            default:
                System.out.println("Nao precisa ter medo, nao da mais para ouvir a fera.   *saindo para explorar*");
        }
        System.out.println("Voce saiu para fora do quarto novamente...  agora podendo os seus pes e um metro a sua frente...");
        System.out.println("Os numeros quando voce aproxima o seu pau...     isso foi indecente, desculpe...    o pau brilhante, ele muda de cor...");
        System.out.println("Espere...   que cor e a chave que voce pegou?   tente colocar na porta da mesma cor");
        System.out.println("1. COLOCAR CHAVE NA PORTA VERDE");
        System.out.println("2. COLOCAR CHAVE NA PORTA AZUL");
        System.out.println("3. COLOCAR CHAVE NA PORTA VERMELHA");
        int chave2 = entrada.nextInt();
        switch (chave2) {
            case 1:
                System.out.println("Nao esta entrando... tente em outra porta");
                System.out.println("2. COLOCAR CHAVE NA PORTA AZUL");
                int outra = entrada.nextInt();
            case 2:
                System.out.println("Tem certeza que voce esta vendo a cor certa da porta?");
                System.out.println("voce e dautonico ne ? coloque na ultima porta do corredor.");
                System.out.println("1. COLOCAR CHAVE NA PORTA VERMELHA");
                int verme = entrada.nextInt();
            default:
                System.out.println("Voce conseguiu destrancar a porta, abra com cuidado... nao sabemos o que tem do outro lado.");
        }
        System.out.println("*voce abriu a porta e encontrou a fera...*");
        System.out.println("ela esta dormindo?");
        System.out.println("A fera possui garras enormes, dentes maiores ainda...");
        System.out.println("Ela guarda uma porta semi aberta, mas voce nao consegue enxergar nada la dentro...");
        System.out.println("Essa criatura deve ter uns 4 metros...        O que voce vai fazer?");
        System.out.println("1. SAIR");
        System.out.println("2. CAMINHAR EM DIRECAO A PORTA");
        int decisao3 = entrada.nextInt();
        switch (decisao3) {
            case 1:
                System.out.println("Se voce sair agora, provavemente a fera vai acordar faminta e vai ir atras de voce...   *caminhar ate a porta*");
                break;
            case 2:
                System.out.println("*caminhando cuidadosamente...*");
        }
        System.out.println("Voce da um passo em falso e acaba de torcer o seu pe... mas por sorte voce nao fez nenhum barulho que acordasse a fera.     *voce nao pode mais correr...* ");
        System.out.println("A luz do pedaco de pau se apagou de vez...  acho melhor nao usar outro para nao fazer barulho...");
        System.out.println("ESPERA ... tive uma ideia, abra bem a porta e jogue esse pedaco de pau que acabou para fora da sala...           Assim ela vai para fora ver o barulho e voce fecha a porta...");
        System.out.println("1. JOGAR O PAU FORA");
        int pau2 = entrada.nextInt();
        switch (pau2) {
            case 1:
                System.out.println("Voce joga com toda a sua forca o pedaco de pau e a fera acorda...");
            default:
                System.out.println("A fera acorda te ve e te devora por completo sem dar chances de voce fugir...");
        }
        System.out.println("A fera comeca a rosnar e vai em direcao ao pedaco de pau...");
        System.out.println("No momento em que a fera vai sair para fora...  voce conseguiu ver no pescoco dessa fera uma marca...");
        System.out.println("Marca como se fosse de uma brasa apagada em volta do pescoco");
        System.out.println("Voce rapidamente fecha a porta");
        System.out.println("E agora?? o que voce vai fazer?");
        System.out.println("1. Procurar alguma arma contra a fera");
        System.out.println("2. Correr para a porta semi aberta");
        int decisao4 = entrada.nextInt();
        switch (decisao4) {
            case 1:
                System.out.println("Voce procura algo... Mas nao consegue encontrar nada, acho melhor ir para a porta semi aberta");
            case 2:
                System.out.println("Voce observa a porta semi aberta completamente cheia de sangue e comeca a se lembrar do que estava prestes a acontecer...");
        }
        System.out.println("Voce observa a fera vindo em sua direcao... a fera olha diretamente nos seus olhos... e ve um brilho vindo de voce...");
        System.out.println("O seu colar comeca a arder em chamas...     Mas elas nao estao te queimando...      A fera se aproxima lentamente de voce...");
        System.out.println("As marcas em volta de seu pescoco comecam a brilhar...");
        System.out.println("1. ENTREGAR COLAR");
        int colar = entrada.nextInt();
        switch (colar) {
            case 1:
                System.out.println("Voce entrega o colar a fera, e aquela criatura totalmente amedrontadora...  volta na sua forma natural...   uma mulher de olhos castanhos, com cabelos loiro escuro");
        }
        System.out.println("Obrigado...     Eu nao estava agindo assim por querer...    Eu nao tenho controle sem este colar...");
        System.out.println(" Essa era minha ultima noite... se eu nao encontrasse o colar eu iria me transformar assim para sempre...   voce me salvou, e salvou a muitos...");
        System.out.println("obrigado " + nome);
        System.out.println("Esta porta vai te levar de onde voce veio...");
        System.out.println("FIM.");
    }

}
