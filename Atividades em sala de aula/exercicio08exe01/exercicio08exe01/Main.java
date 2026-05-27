package exercicio08exe01;

public class Main {
    public static void main(String[] args) {
        double testeGalao = ConversorDeUnidades.converterLitrosParaGaloes(4);
        double testeMetro = ConversorDeUnidades.converterMetrosParaPes(4);
        double testeLibra = ConversorDeUnidades.converterQuilosParaLibras(4);

        System.out.println(testeGalao);
        System.out.println(testeMetro);
        System.out.println(testeLibra);
        
        
        
    }
}
