package model;

import java.time.LocalTime;

public class GerarFila {
    public void sistemaDeLogistica(GerarCargaDeMercadoria horario) {
        LocalTime horarioDeChegada = horario.getHorarioDeChegada();
        LocalTime horarioAcrescentar;
        LocalTime resultadoSoma;

        int capacidadeDoCaminhao = horario.getMercadoria() + 1;
        int mercadoria = horario.getMercadoria();
        int x = ((89 % 3) + 1); //RM 95989

        System.out.println(x + " minutos é o tempo necessário para preparar 3 mercadorias simultaneamente.");
        System.out.println("Horario de chegada da Van: " + horario.getHorarioDeChegada());
        System.out.println("Quantidade de mercadorias: " + horario.getMercadoria());
        System.out.println("Possui " + mercadoria + " mercadorias na fila, entao o tempo de carregamento será de " + mercadoria + " minutos");
        System.out.println("----------------------------------------------------------");

        for (int i = 2; i <= capacidadeDoCaminhao * x; i++) {

            horarioAcrescentar = LocalTime.of(0, i);
            resultadoSoma = horarioDeChegada.plusMinutes(horarioAcrescentar.getMinute());
            System.out.print(resultadoSoma + ": ");

            if (mercadoria <= 3) {
                horarioAcrescentar = LocalTime.of(0, i + mercadoria);
                resultadoSoma = horarioDeChegada.plusMinutes(horarioAcrescentar.getMinute());
                System.out.println("...");
                System.out.println("----------------------------------------------------------");
                System.out.println("Restam apenas " + mercadoria + " mercadorias");
                System.out.println("Finalizando as cargas...");
                System.out.println("As cargas foram finalizadas e esta pronto para a entrega");
                System.out.println("Horario: " + resultadoSoma);
                return;
            }

            if (i % 2 == 0 && i % 3 == 0) {
                System.out.print("Uma mercadoria foi adicionada à fila, porém mais 3 foram realizadas, agoram restam: ");
                mercadoria -= 2;
                System.out.println(mercadoria + " mercadorias");

            } else if (i % 2 == 0) {
                System.out.print("Passou 2 minutos, foi adicionado mais uma mercadoria à fila, agora restam: ");
                mercadoria++;
                System.out.println(mercadoria + " mercadorias");

            } else if (i % 3 == 0) {
                System.out.print("Passaram 3 minutos, 3 mercadorias foram realizadas, agoram restam: ");
                mercadoria -= 3;
                System.out.println(mercadoria + " mercadorias");
            } else {
                System.out.println("...");
            }
        }
    }
}

