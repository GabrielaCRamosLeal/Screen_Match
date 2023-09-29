package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalListas {
    public static void main(String[] args) {

        Filme filme1 = new Filme("Dois mil e doze",2011);
        filme1.avalia(6);
        Filme filme2 = new Filme("Anaconda", 1990);
        filme2.avalia(7);
        Filme filme3 = new Filme ("Diário da Princesa",2000);
        filme3.avalia(8);
        Serie lost = new Serie("Lost", 2000);

        //Interface: List; método: ArrayList.

        List<Titulo> listaDeAssistidos = new ArrayList<>();
        listaDeAssistidos.add(filme1);
        listaDeAssistidos.add(filme2);
        listaDeAssistidos.add(filme3);
        listaDeAssistidos.add(lost);

        for (Titulo item: listaDeAssistidos) {
            System.out.println(item);
            if (item instanceof Filme filme){
            System.out.println("Classificação: " + filme.getClassificacao());}
        }
        //listaDeAssistidos.forEach(lista -> System.out.println(lista));
        //listaDeAssistidos.forEach(System.out::println);

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Larissa");
        buscaPorArtista.add("Carla");
        buscaPorArtista.add("Fernanda");

        System.out.println(buscaPorArtista);
        //Para deixar em ordem alfabética:
        Collections.sort(buscaPorArtista);
        System.out.println(buscaPorArtista);

        Collections.sort(listaDeAssistidos);
        System.out.println(listaDeAssistidos);

        listaDeAssistidos.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(listaDeAssistidos);
    }
}
