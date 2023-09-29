package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class calculadoraDeTempo {

    private int tempoTotal;

    public int getTempoTotal () {
        return tempoTotal;
    }
    /*public void inclui (filme f){
        tempoTotal += f.getDuracaoEmMinutos();
    }
    public void inclui (serie s){
        tempoTotal += s.getDuracaoEmMinutos();
    }*/

    public void inclui (Titulo t){
        tempoTotal += t.getDuracaoEmMinutos();
    }
}
