package pauloricardson;

import pauloricardson.model.Categoria;
import pauloricardson.model.Item;
import pauloricardson.model.Mercado;

public class Main {
    public static void main(String[] args) {

        // Categorias
        Categoria alimentos = new Categoria("Alimentos");
        Categoria higienePessoal = new Categoria("Higiente Pessoal");
        Categoria higienteDoLar = new Categoria("Higiente do Lar");

        // Itens
        Item cafe = new Item("Café", 10.99);
        Item arroz = new Item("Arroz 5 kg", 15.95);
        Item feijao = new Item("Feijao 1 kg", 6.99);

        Item colgate = new Item("Colgate", 2.59);
        Item desodorante = new Item("desodorante", 11.99);

        Item detergente = new Item("detergente", 1.69);
        Item desinfetante = new Item("desinfetante", 5.69);

        alimentos.adicionarItens(cafe);
        alimentos.adicionarItens(arroz);
        alimentos.adicionarItens(feijao);

        higienePessoal.adicionarItens(colgate);
        higienePessoal.adicionarItens(desodorante);

        higienteDoLar.adicionarItens(detergente);
        higienteDoLar.adicionarItens(desinfetante);

        Mercado melhorpreco = new Mercado("Melhor preco");
        melhorpreco.adicionarCategoria(alimentos);
        melhorpreco.adicionarCategoria(higienePessoal);
        melhorpreco.adicionarCategoria(higienteDoLar);

        Mercado bomJesus = new Mercado("Mercado Bom Jesus");
        bomJesus.adicionarCategoria(alimentos);
        bomJesus.adicionarCategoria(higienePessoal);
        bomJesus.adicionarCategoria(higienteDoLar);
    }
}