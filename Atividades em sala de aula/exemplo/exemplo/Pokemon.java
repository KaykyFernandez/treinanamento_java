package exemplo;

public class Pokemon {

    private String nome;
    private String tipo;
    private int level;

    public Pokemon(String n , String t){
        nome = n;
        tipo = t;
        level = 1;
    }

    public void imprimir() {
        System.out.println("Dados do Pokemon");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo: " + tipo);
        System.out.println("Level: " + level);
    }

    public void executar_habilidade(String habilidade){
        System.out.println(nome + " usou a habilidade " + habilidade);
    }

    public int getLevel(){
        return level;
    }
    public String getNome(){
        return nome;
    }
    public String getTipo(){
        return tipo;
    }

    public void setNome(String n){
        nome = n;
    
    }

    public void subirLevel(){
        level ++;
    }

 }