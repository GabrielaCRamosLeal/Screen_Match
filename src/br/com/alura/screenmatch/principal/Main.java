package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.calculos.calculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Episodios;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Filme filme1 = new Filme("Dois mil e doze",2011);
        //filme1.setNome("2012");
        //filme1.setAnoDeLancamento(2011);
        filme1.setInclusoNoPlano(true);
        filme1.setDuracaoEmMinutos(180);

        System.out.println(filme1.getNome());
        System.out.println("Seu ano de lançamento é " + filme1.getAnoDeLancamento());

        filme1.exibeFichaTecnica();

        filme1.avalia(8);
        filme1.avalia(10);
        filme1.avalia(5);

        System.out.println("Quantidade de avaliações: " + filme1.getNumeroDeAvaliacoes());
        System.out.println("Média das avaliações " + filme1.obtennhaMedia());

        Serie lost = new Serie("Lost", 2000);
        //lost.setNome("Lost");
        //lost.setAnoDeLancamento(2000);
        lost.setAtiva(true);
        lost.setEpisodios(50);
        lost.setTemporadas(10);
        lost.setMinutosPorEpisodio(30);

        System.out.println(lost.getDuracaoEmMinutos());
        lost.exibeFichaTecnica();
        System.out.println("Ela está ativa no sistema? " + lost.getAtiva());

        Filme filme2 = new Filme("Anaconda", 1990);
        //filme2.setNome("Anaconda");
        //filme2.setAnoDeLancamento(1990);
        filme2.setDuracaoEmMinutos(140);
        filme2.setInclusoNoPlano(true);

        calculadoraDeTempo calculo = new calculadoraDeTempo();
        calculo.inclui(filme1);
        calculo.inclui(filme2);
        calculo.inclui(lost);
        System.out.println(calculo.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filme2);

        Episodios episodio = new Episodios();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        Filme filme3 = new Filme ("Diário da Princesa",2000);
        //filme3.setAnoDeLancamento(2000);
        filme3.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filme1);
        listaDeFilmes.add(filme2);
        listaDeFilmes.add(filme3);
        System.out.println("Tamanho da lista " + listaDeFilmes.size());
        //Outra forma de fazer: System.out.println("Tamanho da lista " + listaDeFilmes.toArray().length);
        System.out.println("Primeiro filme " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);

        System.out.println(filme3.toString());
    }
}