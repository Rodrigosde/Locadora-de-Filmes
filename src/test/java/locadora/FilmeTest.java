package locadora;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilmeTest {

    @Test
    void deveRetonarNomeFilme() {
        Filme filme = new Filme("Vingadores", 10.0f);
        assertEquals("Vingadores", filme.getNome());
    }

    @Test
    void deveRetornarValorFilme() {
        Filme filme = new Filme("Vingadores", 10.0f);
        assertEquals(10.0f, filme.getValor());
    }
}
