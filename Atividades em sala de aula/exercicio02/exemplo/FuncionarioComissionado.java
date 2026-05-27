package exemplo;

class FuncionarioComissionado extends Funcionario {
    private double totalVendas;
    private double percentualComissao;

    public FuncionarioComissionado(String nome, String cpf, double totalVendas, double percentualComissao) {
        super(nome, cpf);
        this.totalVendas = totalVendas;
        this.percentualComissao = percentualComissao;
    }

    public double calcularPagamento() {
        return totalVendas * percentualComissao;
    }
}