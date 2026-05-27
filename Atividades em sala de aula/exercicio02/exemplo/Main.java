package exemplo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Funcionario> listaFuncionarios = new ArrayList<Funcionario>();

        listaFuncionarios.add(new FuncionarioAssalariado("Ana Silva", "123.456.789-00", 5000.00));
        listaFuncionarios.add(new FuncionarioHorista("Carlos Souza", "987.654.321-11", 160, 25.50));
        listaFuncionarios.add(new FuncionarioComissionado("Beatriz Costa", "456.123.789-22", 50000.00, 0.05));

        System.out.println("--- PROCESSAMENTO DE PAGAMENTOS ---\n");

        for (Funcionario f : listaFuncionarios) {
            f.imprimir(); 
            
            double pagamento = f.calcularPagamento(); 
            
            System.out.printf(" | Pagamento: R$ %.2f%n", pagamento);
        }
    }
}