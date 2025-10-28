package pauloricardson.model;

import java.util.ArrayList;

public class Mercado {
    private int codigo;
    private String nome;
    private ArrayList<Categoria> categorias;
    private ArrayList<Item> itens;

    public Mercado(String nome) {
        this.setCategorias(new ArrayList<>());
        this.setItens(new ArrayList<>());

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(ArrayList<Categoria> categorias) {
        this.categorias = categorias;
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }
    public void adicionarCategoria(Categoria categoria){
        categorias.add(categoria);
    }

    public void removerCategoria(int codigo){
        System.out.println(categorias.get(codigo).getNome() + " foi removido com sucesso");
        categorias.remove(codigo);
    }

    public void adicionarItem(Item item){
        itens.add(item);
    }

    public void removerItem(int codigo){
        System.out.println(itens.get(codigo).getNome() + " foi removido com sucesso!");
        itens.remove(codigo);
    }

    public void apresentarCategorias(){
        for (int i = 0; i < categorias.size(); i++){
            System.out.println("Código: " + i + ", Nome da cotegoria: " + categorias.get(i).getNome());
        }
    }

    public void apresentarItens(){
        for (int i = 0; i < itens.size(); i++){
            System.out.println("Código: " + i + ", Nome do item: " + itens.get(i).getNome() + ", Preço: " + itens.get(i).getPreco());
        }
    }

}
