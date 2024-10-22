import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculo.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Movie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie("O poderoso chefão", 1978);
        myMovie.setDuracaoEmMinutos(180);
        myMovie.setIncluidoNoPlano(true);

        myMovie.exibeFichaTecnica();
        myMovie.avalia(8);
        myMovie.avalia(5);
        myMovie.avalia(4);
        System.out.println("Total de avaliações: " + myMovie.getTotalDeAvaliacao());
        System.out.println("Média de avaliações do filme: " + myMovie.mediaAvaliacao());

        Movie outroFilme = new Movie("Outro Filme", 2023);
        outroFilme.setDuracaoEmMinutos(200);
        outroFilme.setIncluidoNoPlano(true);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(myMovie);
        calculadora.inclui(outroFilme);
        System.out.println("Tempo total: " + calculadora.getTempoTotal() + " minutos");

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(myMovie);

        Movie filmeDoPaulo = new Movie("Dogville", 2003);
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.setIncluidoNoPlano(true);
        filmeDoPaulo.avalia(10);

        ArrayList<Movie> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(myMovie);
        listaDeFilmes.add(outroFilme);
        System.out.println("Total de filmes: " + listaDeFilmes.size());
        System.out.println("Primeiro filme " + listaDeFilmes.get(0).getNome());
        System.out.println("Segundo filme " + listaDeFilmes.get(1).getNome());
        System.out.println("Terceiro filme " + listaDeFilmes.get(2).getNome());
        System.out.println(listaDeFilmes);
    }
}