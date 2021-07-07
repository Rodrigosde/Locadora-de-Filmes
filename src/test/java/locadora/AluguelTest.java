package locadora;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AluguelTest {
    Filme filme;
    List<Filme> filmes;
    Aluguel aluguel;

    @BeforeEach
    void setUp(){
        filmes = new ArrayList<Filme>();
        filme = new Filme("Batman", 10.0f);
        aluguel = new Aluguel();
    }

    @Test
    void deveAlugarUmFilme() {
        filmes.add(filme);
        assertEquals(10.0f, aluguel.calcularAluguel(filmes));
    }

    @Test
    void deveAlugarDoisFilmes() {
        filmes.add(filme);
        filmes.add(filme);
        assertEquals(20.0f, aluguel.calcularAluguel(filmes));
    }

    @Test
    void deveAlugarTresFilmes() {
        filmes.add(filme);
        filmes.add(filme);
        filmes.add(filme);
        assertEquals(27.5f, aluguel.calcularAluguel(filmes));
    }

    @Test
    void deveAlugarQuatroFilmes() {
        filmes.add(filme);
        filmes.add(filme);
        filmes.add(filme);
        filmes.add(filme);
        assertEquals(32.5f, aluguel.calcularAluguel(filmes));
    }
    @Test
    void deveAlugarCincoFilmes() {
        filmes.add(filme);
        filmes.add(filme);
        filmes.add(filme);
        filmes.add(filme);
        filmes.add(filme);
        assertEquals(35.0f, aluguel.calcularAluguel(filmes));
    }
    @Test
    void deveAlugarSeisFilmes() {
        filmes.add(filme);
        filmes.add(filme);
        filmes.add(filme);
        filmes.add(filme);
        filmes.add(filme);
        filmes.add(filme);
        assertEquals(35.0f, aluguel.calcularAluguel(filmes));
    }
    @Test
    void deveAlugarSeteFilmes() {
        filmes.add(filme);
        filmes.add(filme);
        filmes.add(filme);
        filmes.add(filme);
        filmes.add(filme);
        filmes.add(filme);
        filmes.add(filme);
        assertEquals(45.0f, aluguel.calcularAluguel(filmes));
    }
    @Test
    void deveAlugarNoveFilmes() {
        filmes.add(filme);
        filmes.add(filme);
        filmes.add(filme);
        filmes.add(filme);
        filmes.add(filme);
        filmes.add(filme);
        filmes.add(filme);
        filmes.add(filme);
        filmes.add(filme);
        assertEquals(65.0f, aluguel.calcularAluguel(filmes));
    }
}
