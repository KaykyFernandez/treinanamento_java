package atvd03;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String name, double price, int quant) {
        nome = name;
        preco = price;
        quantidadeEstoque = quant;

    }

    public String exibirDetalhes(){
        String dadoProduto = "nome: "+ nome+"\nPreço: R$"+preco+"\nquantidade: "+quantidadeEstoque;

        return dadoProduto;
    }

    public void setQuantidadeEstoque() {
        this.quantidadeEstoque += quantidadeEstoque;
    }
    
    

}
/*o Métodos públicos:

▪ adicionarEstoque(int quantidade): Adiciona
unidades ao estoque.
▪ removerEstoque(int quantidade): Remove unidades
do estoque, se houver quantidade suficiente.*/