package model;

import java.time.LocalTime;

public class GerarCargaDeMercadoria {
    private int mercadoria;

    private LocalTime horarioDeChegada;

    public int getMercadoria() {
        return mercadoria;
    }

    public void setMercadoria(int mercadoria) {
        this.mercadoria = mercadoria;
    }

    public LocalTime getHorarioDeChegada() {
        return horarioDeChegada;
    }

    public void setHorarioDeChegada(LocalTime horarioDeChegada) {
        this.horarioDeChegada = horarioDeChegada;
    }
}


