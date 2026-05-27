package exemplo;

public class main {
    public static void main(String[] args) throws Exception {
        

        Pokemon pikachu = new Pokemon("Pikachu","Elétrico");
        pikachu.imprimir();

        

        Pokemon charmander = new Pokemon("Charmander","Fogo");
        charmander.imprimir();

        pikachu.executar_habilidade("Choque do Trovão");
        charmander.executar_habilidade("Cinzas");

        pikachu.subirLevel();
        pikachu.imprimir();
    }
}
