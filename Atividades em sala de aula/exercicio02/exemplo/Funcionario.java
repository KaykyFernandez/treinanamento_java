package exemplo;

// Classe base abstrata
abstract class Funcionario {
    private String nome;
    private String cpf;

    public Funcionario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public abstract double calcularPagamento();

    public void imprimir() {
        System.out.print("Nome: " + nome + " | CPF: " + cpf);
    }
}