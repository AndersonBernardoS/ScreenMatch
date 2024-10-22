package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Movie;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Title;

public class PrincipalComListas {
    public static void main(String[] args) {
        Movie myMovie = new Movie("O poderoso chefão", 1978);
        Movie outroFilme = new Movie("Outro Filme", 2023);
        Movie filmeDoPaulo = new Movie("Dogville", 2003);
        Serie lost = new Serie("Lost", 2000);

        ArrayList<Title> listaDeAssistidos = new ArrayList<>();
            listaDeAssistidos.add(filmeDoPaulo);
            listaDeAssistidos.add(myMovie);
            listaDeAssistidos.add(outroFilme);
            listaDeAssistidos.add(lost);

        for (Title item: listaDeAssistidos){
            System.out.println(item);
        }

        ArrayList<String> buscaPorArtistas = new ArrayList<>();
        buscaPorArtistas.add("Keanu Reeves");
        buscaPorArtistas.add("Scarlett Johansson");
        buscaPorArtistas.add("Anne Hathaway");

        Collections.sort(buscaPorArtistas);
        System.out.println(buscaPorArtistas);
        listaDeAssistidos.sort(Comparator.comparing(Title::getAnoDeLancamento));

    }
}
