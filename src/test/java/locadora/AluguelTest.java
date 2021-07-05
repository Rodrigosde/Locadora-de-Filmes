package locadora;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AluguelTest {

    @Test
    void deveAlugarUmFilme() {
        List<Filme> filmes = new ArrayList<Filme>();
        Filme filme = new Filme("Batman", 10.0f);
        filmes.add(filme);
        Aluguel aluguel = new Aluguel();
        assertEquals(10.0f, aluguel.calcularAluguel(filmes));
    }

    @Test
    void deveAlugarDoisFilmes() {
        List<Filme> filmes = new ArrayList<Filme>();
        Filme filme = new Filme("Batman", 10.0f);
        filmes.add(filme);
        filmes.add(filme);
        Aluguel aluguel = new Aluguel();
        assertEquals(20.0f, aluguel.calcularAluguel(filmes));
    }

    @Test
    void deveAlugarTresFilmes() {
        List<Filme> filmes = new ArrayList<Filme>();
        Filme filme = new Filme("Batman", 10.0f);
        filmes.add(filme);
        filmes.add(filme);
        filmes.add(filme);
        Aluguel aluguel = new Aluguel();
        assertEquals(27.5f, aluguel.calcularAluguel(filmes));
    }

    @Test
    void deveAlugarQuatroFilmes() {
        List<Filme> filmes = new ArrayList<Filme>();
        Filme filme = new Filme("Batman", 10.0f);
        filmes.add(filme);
        filmes.add(filme);
        filmes.add(filme);
        filmes.add(filme);

        Aluguel aluguel = new Aluguel();
        assertEquals(32.5f, aluguel.calcularAluguel(filmes));
    }
    @Test
    void deveAlugarCincoFilmes() {
        List<Filme> filmes = new ArrayList<Filme>();
        Filme filme = new Filme("Batman", 10.0f);
        filmes.add(filme);
        filmes.add(filme);
        filmes.add(filme);
        filmes.add(filme);
        filmes.add(filme);

        Aluguel aluguel = new Aluguel();
        assertEquals(35.0f, aluguel.calcularAluguel(filmes));
    }
    @Test
    void deveAlugarSeisFilmes() {
        List<Filme> filmes = new ArrayList<Filme>();
        Filme filme = new Filme("Batman", 10.0f);
        filmes.add(filme);
        filmes.add(filme);
        filmes.add(filme);
        filmes.add(filme);
        filmes.add(filme);
        filmes.add(filme);

        Aluguel aluguel = new Aluguel();
        assertEquals(35.0f, aluguel.calcularAluguel(filmes));
    }
    @Test
    void deveAlugarSeteFilmes() {
        List<Filme> filmes = new ArrayList<Filme>();
        Filme filme = new Filme("Batman", 10.0f);
        filmes.add(filme);
        filmes.add(filme);
        filmes.add(filme);
        filmes.add(filme);
        filmes.add(filme);
        filmes.add(filme);
        filmes.add(filme);

        Aluguel aluguel = new Aluguel();
        assertEquals(45.0f, aluguel.calcularAluguel(filmes));
    }
    @Test
    void deveAlugarNoveFilmes() {
        List<Filme> filmes = new ArrayList<Filme>();
        Filme filme = new Filme("Batman", 10.0f);
        filmes.add(filme);
        filmes.add(filme);
        filmes.add(filme);
        filmes.add(filme);
        filmes.add(filme);
        filmes.add(filme);
        filmes.add(filme);
        filmes.add(filme);
        filmes.add(filme);

        Aluguel aluguel = new Aluguel();
        assertEquals(65.0f, aluguel.calcularAluguel(filmes));
    }
}
