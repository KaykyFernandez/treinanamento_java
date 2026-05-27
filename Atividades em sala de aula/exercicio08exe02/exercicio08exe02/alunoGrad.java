package exercicio08exe02;

public class alunoGrad extends aluno {
    private Float media;


    public alunoGrad(int ra, String nome, Boolean matriculado, Float media) {
        super(ra, nome, matriculado);
        this.media = media;
    }

    public void ImprimirDados(){
        super.ImprimirDados();
        System.out.printf("Média: %.2f ", media);
    }
    

}
