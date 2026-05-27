package exercicio03;


class Batman extends Heroi implements IParceiro{
    private String enderecoDaBatCaverna;

    public Batman(String nome, String codinome, String universo, String enderecoDaBatCaverna){
        super(nome, codinome, universo);
        this.enderecoDaBatCaverna = enderecoDaBatCaverna;
    }

    public void executarPoder(){
        
        System.out.println(codinome + " executando poder: Muito Dinheiro!");
    }

    public void exibirEnderecoBatCaverna(){
        System.out.println("Endereço da Batcaverna: " + enderecoDaBatCaverna);
    }

    public void exibirNomeParceiro(){
        System.out.println("Parceiro do Batman: Robin");
    }

    public void executarPoderParceiro(){
        System.out.println("Robin executando poder: Acrobacias!");
    }
}