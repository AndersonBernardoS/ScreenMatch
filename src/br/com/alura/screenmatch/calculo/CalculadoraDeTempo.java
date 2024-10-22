package br.com.alura.screenmatch.calculo;

import br.com.alura.screenmatch.modelos.Title;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    public void inclui(Title t) {
        this.tempoTotal += t.getDuracaoEmMinutos();
    }
}
