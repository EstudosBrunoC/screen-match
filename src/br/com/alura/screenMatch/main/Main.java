package br.com.alura.screenMatch.main;

import br.com.alura.screenMatch.modelos.Episodio;
import br.com.alura.screenMatch.modelos.Filme;
import br.com.alura.screenMatch.modelos.Serie;
import br.com.alura.screenMatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenMatch.calculos.FiltroRecomendacao;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Filme filme1 = new Filme("O poderoso chefão", 1970);
        //filme1.setNome("O poderoso chefão");
        //filme1.setAnoDeLancamento(1970);
        filme1.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + filme1.getDuracaoEmMinutos());

        filme1.exibeFichaTecnica();
        filme1.avalia(8);
        filme1.avalia(5);
        filme1.avalia(10);
        System.out.println("Total de avaliações: " + filme1.getTotalDeAvaliacoes());
        System.out.println(filme1.pegaMedia());

        Serie lost = new Serie("Lost", 2000);
        //lost.setNome("Lost");
        //lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpPorTemporada(10);
        lost.setMinPorEp(50);

        System.out.println("Duração da serie: " + lost.getDuracaoEmMinutos());

        Filme filme2 = new Filme("Avatar", 2023);
        //filme2.setNome("Avatar");
        //filme2.setAnoDeLancamento(2023);
        filme2.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme1);
        calculadora.inclui(filme2);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filme1);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVizualizacoes(300);
        filtro.filtra(episodio);

        var filme3 = new Filme("Dogville", 2003);
        filme3.setDuracaoEmMinutos(200);
        // filme3.setNome("Dogville");
        // filme3.setAnoDeLancamento(2003);
        filme3.avalia(10);

        ArrayList<Filme> listaDeFIlmes = new ArrayList<>();

        listaDeFIlmes.add(filme1);
        listaDeFIlmes.add(filme2);
        listaDeFIlmes.add(filme3);
        System.out.println("Filmes na lista: " + listaDeFIlmes.size());
        System.out.println("Primeiro fiome: " + listaDeFIlmes.get(0).getNome());
        System.out.println(listaDeFIlmes);
        System.out.println("toString do filme " + listaDeFIlmes.get(0).toString());



    }
}