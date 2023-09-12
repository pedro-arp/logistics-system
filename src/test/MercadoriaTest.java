package test;

import model.GerarCargaDeMercadoria;
import model.GerarFila;

import java.time.LocalTime;

public class MercadoriaTest {
    public static void main(String[] args) {
        GerarCargaDeMercadoria filaDeMercadorias = new GerarCargaDeMercadoria();
        GerarFila impressora = new GerarFila();

        filaDeMercadorias.setMercadoria((int) (Math.random() * 14 + 1));
        filaDeMercadorias.setHorarioDeChegada(LocalTime.of(20, 10));

        impressora.sistemaDeLogistica(filaDeMercadorias);

    }
}
