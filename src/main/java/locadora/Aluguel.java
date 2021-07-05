package locadora;

import java.util.List;

public class Aluguel {


    public float calcularAluguel(List<Filme> filmes) {
        float total = 0;
        for (int i=0; i < filmes.size(); i++) {
            if (i == 2) {
                total += filmes.get(i).getValor() * 0.75;
            }else if (i == 3) {
                total += filmes.get(i).getValor() * 0.5;
            }else if (i == 4) {
                total += filmes.get(i).getValor() * 0.25;
            }else if (i == 5) {
                total += filmes.get(i).getValor() * 0.0;
            }
            else {
                total += filmes.get(i).getValor();
            }
        }
        return total;
    }

}
