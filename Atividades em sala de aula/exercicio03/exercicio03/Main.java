package exercicio03;

public class Main{
    public static void main(String[] args){
        
        Batman batman = new Batman("Bruce Wayne", "Batman", "DC Comics", "Sob a Mansão Wayne, Gotham City");
        HomemAranha homemAranha = new HomemAranha("Peter Parker", "Homem-Aranha", "Marvel", 1);

        
        System.out.println("--- DADOS DO BATMAN ---");
        batman.imprimirAtributos();
        batman.exibirEnderecoBatCaverna();
        System.out.println();


        System.out.println("--- DADOS DO HOMEM-ARANHA ---");
        homemAranha.imprimirAtributos();
        homemAranha.exibirNumeroDeMortesTioBen();
        System.out.println();


        System.out.println("--- EXECUTANDO PODERES ---");
        batman.executarPoder();
        homemAranha.executarPoder();
        System.out.println();

        
        System.out.println("--- PARCEIRO DO BATMAN ---");
        batman.exibirNomeParceiro();
        batman.executarPoderParceiro();
    }
}