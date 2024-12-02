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

        //if e else para realizar a contabilização dos acertos e dos erros
        if(p5.isCorreta(resposta)) {
            acertos++;
        }

        System.out.println("-------------------------------------------------------------");

        Questao p6= new Questao();
        p6.pergunta = "(6) Qual é a função do óleo do motor?";
        p6.opcaoA = "(A) - Lubrificar o motor";
        p6.opcaoB = "(B) - Resfriar o motor";
        p6.opcaoC = "(C) - Limpar o motor";
        p6.opcaoD = "(D) - Aumentar a potência";
        p6.opcaoE = "(E) - Reduzir consumo de combustível";
        p6.correta = "a";

        p6.escrevaQuestao();
        resposta = p6.leiaResposta();

        //if e else para realizar a contabilização dos acertos e dos erros
        if(p6.isCorreta(resposta)) {
            acertos++;
        }

        System.out.println("----------------------------------------------------------------");

        Questao p7= new Questao();
        p7.pergunta = "(7) Qual é a marca de carro conhecida pelo modelo 'Mustang'?";
        p7.opcaoA = "(A) - Nissan";
        p7.opcaoB = "(B) - Dodge";
        p7.opcaoC = "(C) - Fiat";
        p7.opcaoD = "(D) - Subaru";
        p7.opcaoE = "(E) - Ford";
        p7.correta = "e";

        p7.escrevaQuestao();
        resposta = p7.leiaResposta();

        //if e else para realizar a contabilização dos acertos e dos erros
        if(p7.isCorreta(resposta)) {
            acertos++;
        }

        System.out.println("-----------------------------------------------------------------");

        Questao p8= new Questao();
        p8.pergunta = "(8) Qual é a função do alternador em um veículo?";
        p8.opcaoA = "(A) - Aumentar eficiência dos freios";
        p8.opcaoB = "(B) - Fornecer energia elétrica";
        p8.opcaoC = "(C) - Melhorar consumo do veículo";
        p8.opcaoD = "(D) - Alternar o torque das rodas";
        p8.opcaoE = "(E) - N.D.A";
        p8.correta = "b";

        p8.escrevaQuestao();
        resposta = p8.leiaResposta();

        //if e else para realizar a contabilização dos acertos e dos erros
        if(p8.isCorreta(resposta)) {
            acertos++;
        }

        System.out.println("-------------------------------------------------------");

        Questao p9= new Questao();
        p9.pergunta = "(9) Qual o nome do sistema responsável por freiar os veículos?";
        p9.opcaoA = "(A) - Sistema de injeção";
        p9.opcaoB = "(B) - Sistema de ignição";
        p9.opcaoC = "(C) - Sistema de frenagem";
        p9.opcaoD = "(D) - Sistema de parada";
        p9.opcaoE = "(E) - Sistema elétrico";
        p9.correta = "c";

        p9.escrevaQuestao();
        resposta = p9.leiaResposta();

        //if e else para realizar a contabilização dos acertos e dos erros
        if(p9.isCorreta(resposta)) {
            acertos++;
        }

        System.out.println("--------------------------------------------------------");

        Questao p10= new Questao();
        p10.pergunta = "(10) Qual é a marca de carro conhecida pelo modelo 'Civic'?";
        p10.opcaoA = "(A) - Ford";
        p10.opcaoB = "(B) - Hyundai";
        p10.opcaoC = "(C) - Chevrolet";
        p10.opcaoD = "(D) - Volvo";
        p10.opcaoE = "(E) - Honda";
        p10.correta = "e";

        p10.escrevaQuestao();
        resposta = p10.leiaResposta();

        //if e else para realizar a contabilização dos acertos e dos erros
        if(p10.isCorreta(resposta)) {
            acertos++;
        }

        System.out.println("--------------------------------------------------------");

        Questao p11= new Questao();
        p11.pergunta = "(11) Qual é a função do sistema conhecido como 'ABS'?";
        p11.opcaoA = "(A) - Evitar o travamento das rodas";
        p11.opcaoB = "(B) - Melhorar o conforto do veículo";
        p11.opcaoC = "(C) - Melhorar a suspensão do veículo";
        p11.opcaoD = "(D) - Aumentar a potência do motor";
        p11.opcaoE = "(E) - Melhorar eficiência geral do veículo";
        p11.correta = "a";

        p11.escrevaQuestao();
        resposta = p11.leiaResposta();

        //if e else para realizar a contabilização dos acertos e dos erros
        if(p11.isCorreta(resposta)) {
            acertos++;
        }

        System.out.println("--------------------------------------------------------");

        Questao p12= new Questao();
        p12.pergunta = "(12) Qual é o tipo de transmissão mais comum em carros automáticos?";
        p12.opcaoA = "(A) - Manual";
        p12.opcaoB = "(B) - Automática";
        p12.opcaoC = "(C) - CVT";
        p12.opcaoD = "(D) - Semi-automática";
        p12.opcaoE = "(E) - Power-Shift";
        p12.correta = "c";

        p12.escrevaQuestao();
        resposta = p12.leiaResposta();

        //if e else para realizar a contabilização dos acertos e dos erros
        if(p12.isCorreta(resposta)) {
            acertos++;
        }

        System.out.println("--------------------------------------------------------");

        Questao p13= new Questao();
        p13.pergunta = "(13) Qual é a marca de carro conhecida pelo modelo 'Corolla'?";
        p13.opcaoA = "(A) - Ford";
        p13.opcaoB = "(B) - Honda";
        p13.opcaoC = "(C) - Toyota";
        p13.opcaoD = "(D) - Fiat";
        p13.opcaoE = "(E) - Hyundai";
        p13.correta = "c";

        p13.escrevaQuestao();
        resposta = p13.leiaResposta();

        //if e else para realizar a contabilização dos acertos e dos erros
        if(p13.isCorreta(resposta)) {
            acertos++;
        }

        System.out.println("--------------------------------------------------------");

        Questao p14= new Questao();
        p14.pergunta = "(14) Qual é a função do radiador em um veículo?";
        p14.opcaoA = "(A) - Refrigerar a cabine do veículo";
        p14.opcaoB = "(B) - Armazenar o óleo do motor";
        p14.opcaoC = "(C) - Aumentar eficiência do motor";
        p14.opcaoD = "(D) - Resfriar o combustível";
        p14.opcaoE = "(E) - Resfriar a água do motor";
        p14.correta = "e";

        p14.escrevaQuestao();
        resposta = p14.leiaResposta();

        //if e else para realizar a contabilização dos acertos e dos erros
        if(p14.isCorreta(resposta)) {
            acertos++;
        }

        System.out.println("--------------------------------------------------------");

        Questao p15= new Questao();
        p15.pergunta = "(15) Qual é o tipo de pneu mais utilizado em carros de passeio?";
        p15.opcaoA = "(A) - Pneu de corrida";
        p15.opcaoB = "(B) - Pneu radial";
        p15.opcaoC = "(C) - Pneu de neve";
        p15.opcaoD = "(D) - Pneu diagonal";
        p15.opcaoE = "(E) - Pneu de trator";
        p15.correta = "b";

        p15.escrevaQuestao();
        resposta = p15.leiaResposta();

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