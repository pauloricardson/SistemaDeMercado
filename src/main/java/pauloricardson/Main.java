package pauloricardson;

import pauloricardson.model.Categoria;
import pauloricardson.model.Mercado;

public class Main {
    public static void main(String[] args) {

        Categoria alimentos = new Categoria("Alimentos");
        Categoria higienePessoal = new Categoria("Higiente Pessoal");
        Categoria higienteDoLar = new Categoria("Higiente do Lar");

        Mercado melhorpreco = new Mercado("Melhor preco");
        melhorpreco.adicionarCategoria(alimentos);

        Mercado bomJesus = new Mercado("Mercado Bom Jesus");
    }
}