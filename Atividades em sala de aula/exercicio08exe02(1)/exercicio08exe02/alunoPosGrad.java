package exercicio08exe02;

public class alunoPosGrad extends aluno{
       private String  orientador;
       private String tese;


    public alunoPosGrad(int ra, String nome, Boolean matriculado, Float media) {
        super(ra, nome, matriculado);
        this.orientador = orientador;
        this.tese = tese;
    }

    public void ImprimirDados(){
        super.ImprimirDados();
        System.out.printf("Orientador: "+ orientador);
        System.out.printf("Tese: "+ tese);
    }
    

}



