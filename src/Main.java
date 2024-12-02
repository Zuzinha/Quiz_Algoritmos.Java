public class Main {
    public static void main(String[] args) {

        Cabecalho imp = new Cabecalho();
        imp.cab();

        int totalPerguntas = 15;
        int acertos = 0;

        Questao p1= new Questao();
        p1.pergunta = "(1) - Qual é o combustivel mais comum utilizado em carros? ";
        p1.opcaoA = "(A) - Diesel";
        p1.opcaoB = "(B) - Gasolina";
        p1.opcaoC = "(C) - Etanol";
        p1.opcaoD = "(D) - Eletricidade";
        p1.opcaoE = "(E) - Álcool";
        p1.correta = "b";

        p1.escrevaQuestao();
        String resposta = p1.leiaResposta();

        //if e else para realizar a contabilização dos acertos e dos erros
        if(p1.isCorreta(resposta)) {
            acertos++;
        }

        System.out.println("----------------------------------------------------------");

        Questao p2= new Questao();
        p2.pergunta = "(2) Qual é a marca de carros mais vendida no mundo? ";
        p2.opcaoA = "(A) - Volkswagen";
        p2.opcaoB = "(B) - Chevrolet";
        p2.opcaoC = "(C) - Honda";
        p2.opcaoD = "(D) - Toyota";
        p2.opcaoE = "(E) - Nissan";
        p2.correta = "d";

        p2.escrevaQuestao();
        resposta = p2.leiaResposta();
        System.out.println(resposta);

        //if e else para realizar a contabilização dos acertos e dos erros
        if(p2.isCorreta(resposta)) {
            acertos++;
        }

        System.out.println("------------------------------------------------------------");

        Questao p3= new Questao();
        p3.pergunta = "(3) Qual é a função do catalisador em um veículo?";
        p3.opcaoA = "(A) - Aumentar a potência";
        p3.opcaoB = "(B) - Reduzir a emissão de poluentes";
        p3.opcaoC = "(C) - Melhorar a eficiência do combustível";
        p3.opcaoD = "(D) - Reduzir ruídos";
        p3.opcaoE = "(E) - Aumentar a velocidade";
        p3.correta = "b";

        p3.escrevaQuestao();
        resposta = p3.leiaResposta();
        System.out.println(resposta);

        //if e else para realizar a contabilização dos acertos e dos erros
        if(p3.isCorreta(resposta)) {
            acertos++;
        }

        System.out.println("-------------------------------------------------------------");

        Questao p4= new Questao();
        p4.pergunta = "(4) Qual é a velocidade maxíma permitida em rodovias?";
        p4.opcaoA = "(A) - 100 km/h";
        p4.opcaoB = "(B) - 150 km/h";
        p4.opcaoC = "(C) - 120 km/h";
        p4.opcaoD = "(D) - 160 km/h";
        p4.opcaoE = "(E) - 180 km/h";
        p4.correta = "c";

        p4.escrevaQuestao();
        resposta = p4.leiaResposta();
        System.out.println(resposta);

        //if e else para realizar a contabilização dos acertos e dos erros
        if(p4.isCorreta(resposta)) {
            acertos++;
        }

        System.out.println("------------------------------------------------------------");

        Questao p5= new Questao();
        p5.pergunta = "(5) Qual é o tipo de motor mais comum em motocicletas?";
        p5.opcaoA = "(A) - À diesel";
        p5.opcaoB = "(B) - À álcool";
        p5.opcaoC = "(C) - Elétrico";
        p5.opcaoD = "(D) - À gasolina";
        p5.opcaoE = "(E) - N.D.A";
        p5.correta = "d";

        p5.escrevaQuestao();
        resposta = p5.leiaResposta();
        System.out.println(resposta);

        //if e else para realizar a contabilização dos acertos e dos erros
        if(p5.isCorreta(resposta)) {
            acertos++;
        }

        System.out.println("-------------------------------------------------------------");

        Questao p6= new Questao();
        p6.pergunta = "(6) No filme 'A era do gelo' qual o nome da filha de Ellie com Manfred?";
        p6.opcaoA = "(A) - Framboesa";
        p6.opcaoB = "(B) - Cajuzinho";
        p6.opcaoC = "(C) - Amora";
        p6.opcaoD = "(D) - Laranja";
        p6.opcaoE = "(E) - N.D.A";
        p6.correta = "c";

        p6.escrevaQuestao();
        resposta = p6.leiaResposta();
        System.out.println(resposta);

        //if e else para realizar a contabilização dos acertos e dos erros
        if(p6.isCorreta(resposta)) {
            acertos++;
        }

        System.out.println("----------------------------------------------------------------");

        Questao p7= new Questao();
        p7.pergunta = "(7) Qual animal a mamute Ellie acredita ser?";
        p7.opcaoA = "(A) - Gambá";
        p7.opcaoB = "(B) - Gato";
        p7.opcaoC = "(C) - Leão";
        p7.opcaoD = "(D) - Galinha";
        p7.opcaoE = "(E) - Rato";
        p7.correta = "a";

        p7.escrevaQuestao();
        resposta = p7.leiaResposta();
        System.out.println(resposta);

        //if e else para realizar a contabilização dos acertos e dos erros
        if(p7.isCorreta(resposta)) {
            acertos++;
        }

        System.out.println("-----------------------------------------------------------------");

        Questao p8= new Questao();
        p8.pergunta = "(8) Qual o nome original, em inglês, do filme A ERA DO GELO ?";
        p8.opcaoA = "(A) - Ice island";
        p8.opcaoB = "(B) - Snow age";
        p8.opcaoC = "(C) - Snow island";
        p8.opcaoD = "(D) - Ice age";
        p8.opcaoE = "(E) - N.D.A";
        p8.correta = "d";

        p8.escrevaQuestao();
        resposta = p8.leiaResposta();
        System.out.println(resposta);

        //if e else para realizar a contabilização dos acertos e dos erros
        if(p8.isCorreta(resposta)) {
            acertos++;
        }

        System.out.println("-------------------------------------------------------");

        Questao p9= new Questao();
        p9.pergunta = "(9) Qual o nome do melhor amigo do Capitão America ?";
        p9.opcaoA = "(A) - James Barnes";
        p9.opcaoB = "(B) - Steve Rogers";
        p9.opcaoC = "(C) - The winter soldier";
        p9.opcaoD = "(D) - Tony Stark";
        p9.opcaoE = "(E) - N.D.A";
        p9.correta = "a";

        p9.escrevaQuestao();
        resposta = p9.leiaResposta();
        System.out.println(resposta);

        //if e else para realizar a contabilização dos acertos e dos erros
        if(p9.isCorreta(resposta)) {
            acertos++;
        }

        System.out.println("--------------------------------------------------------");

        Questao p10= new Questao();
        p10.pergunta = "(10) Quem deu a aranha de ferro para o Peter ?";
        p10.opcaoA = "(A) - Hulk";
        p10.opcaoB = "(B) - Homem de ferro";
        p10.opcaoC = "(C) - Thor";
        p10.opcaoD = "(D) - Batman";
        p10.opcaoE = "(E) - N.D.A";
        p10.correta = "b";

        p10.escrevaQuestao();
        resposta = p10.leiaResposta();
        System.out.println(resposta);

        //if e else para realizar a contabilização dos acertos e dos erros
        if(p10.isCorreta(resposta)) {
            acertos++;
        }

        System.out.println("--------------------------------------------------------");

        Questao p11= new Questao();
        p11.pergunta = "(11) Quantas joias do infinito existem ?";
        p11.opcaoA = "(A) - 9";
        p11.opcaoB = "(B) - 6";
        p11.opcaoC = "(C) - 3";
        p11.opcaoD = "(D) - 7";
        p11.opcaoE = "(E) - 2";
        p11.correta = "b";

        p11.escrevaQuestao();
        resposta = p11.leiaResposta();
        System.out.println(resposta);

        //if e else para realizar a contabilização dos acertos e dos erros
        if(p11.isCorreta(resposta)) {
            acertos++;
        }

        System.out.println("--------------------------------------------------------");

        Questao p12= new Questao();
        p12.pergunta = "(12) Quantos aliens são disponiveis para o primeiro Ben 10 ?";
        p12.opcaoA = "(A) - 9";
        p12.opcaoB = "(B) - 6";
        p12.opcaoC = "(C) - 3";
        p12.opcaoD = "(D) - 10";
        p12.opcaoE = "(E) - 2";
        p12.correta = "d";

        p12.escrevaQuestao();
        resposta = p12.leiaResposta();
        System.out.println(resposta);

        //if e else para realizar a contabilização dos acertos e dos erros
        if(p12.isCorreta(resposta)) {
            acertos++;
        }

        System.out.println("--------------------------------------------------------");

        Questao p13= new Questao();
        p13.pergunta = "(13) Quantos filmes Velozes e furiosos existem ate o momento ?";
        p13.opcaoA = "(A) - 9";
        p13.opcaoB = "(B) - 6";
        p13.opcaoC = "(C) - 3";
        p13.opcaoD = "(D) - 10";
        p13.opcaoE = "(E) - 2";
        p13.correta = "d";

        p13.escrevaQuestao();
        resposta = p13.leiaResposta();
        System.out.println(resposta);

        //if e else para realizar a contabilização dos acertos e dos erros
        if(p13.isCorreta(resposta)) {
            acertos++;
        }

        System.out.println("--------------------------------------------------------");

        Questao p14= new Questao();
        p14.pergunta = "(14) Quantos filmes Velozes e furiosos existem ate o momento ?";
        p14.opcaoA = "(A) - 9";
        p14.opcaoB = "(B) - 6";
        p14.opcaoC = "(C) - 3";
        p14.opcaoD = "(D) - 10";
        p14.opcaoE = "(E) - 2";
        p14.correta = "d";

        p14.escrevaQuestao();
        resposta = p14.leiaResposta();
        System.out.println(resposta);

        //if e else para realizar a contabilização dos acertos e dos erros
        if(p14.isCorreta(resposta)) {
            acertos++;
        }

        System.out.println("--------------------------------------------------------");

        Questao p15= new Questao();
        p15.pergunta = "(15) Qual a ultima transformação adiquirida por Goku ?";
        p15.opcaoA = "(A) - Super saiyajin";
        p15.opcaoB = "(B) - Kaioken";
        p15.opcaoC = "(C) - Istinto superior";
        p15.opcaoD = "(D) - Ego superior";
        p15.opcaoE = "(E) - N.D.A";
        p15.correta = "c";

        p15.escrevaQuestao();
        resposta = p15.leiaResposta();
        System.out.println(resposta);

        //if e else para realizar a contabilização dos acertos e dos erros
        if(p15.isCorreta(resposta)) {
            acertos++;
        }

        //--------------------------------------------------------------------------
        int erros = totalPerguntas - acertos;
        double porcentagemAcertos = (double) acertos / totalPerguntas * 100;

        System.out.println("Você acertou " + acertos + " de " + totalPerguntas + " perguntas.");
        System.out.println("Você errou " + erros + " perguntas.");
        System.out.printf("Porcentagem de acertos: %.2f%%\n", porcentagemAcertos);

    }
}