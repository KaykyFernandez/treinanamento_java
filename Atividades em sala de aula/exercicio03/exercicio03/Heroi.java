package exercicio03;


abstract class Heroi{

    protected String nome;
    protected String codinome;
    protected String universo;

    public Heroi(String nome, String codinome, String universo){
        this.nome = nome;
        this.codinome = codinome;
        this.universo = universo;
    }

    public abstract void executarPoder();

    public void imprimirAtributos(){
        System.out.println("Nome: " + nome);
        System.out.println("Codinome: " + codinome);
        System.out.println("Universo: " + universo);
    }
}