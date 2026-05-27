package exercicio03;

class HomemAranha extends Heroi{
    private int numeroDeMortesTioBen;

    public HomemAranha(String nome, String codinome, String universo, int numeroDeMortesTioBen){
        super(nome, codinome, universo);
        this.numeroDeMortesTioBen = numeroDeMortesTioBen;
    }

    public void executarPoder(){
        System.out.println(codinome + " executando poder:lançar teias!");
    }

    public void exibirNumeroDeMortesTioBen(){
        System.out.println("Número de mortes do Tio Ben: " + numeroDeMortesTioBen);
    }
}