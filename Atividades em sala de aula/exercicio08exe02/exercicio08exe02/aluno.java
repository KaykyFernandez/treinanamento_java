package exercicio08exe02;

public class aluno {
    private int ra;
    private String nome;
    private Boolean matriculado;    


    public aluno() {
    }

    public aluno(int ra, String nome, Boolean matriculado) {
        this.ra = ra;
        this.nome = nome;
        this.matriculado = matriculado;
    }

    public void ImprimirDados(){
        System.out.printf("RA: "+ra);
        System.out.printf("Nome: "+nome);
        System.out.printf("Matriculado: "+matriculado);
    }

    
}
