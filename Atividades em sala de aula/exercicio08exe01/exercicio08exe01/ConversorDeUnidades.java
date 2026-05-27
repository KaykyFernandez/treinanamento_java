package exercicio08exe01;

public class ConversorDeUnidades {
    private static final double METROS_PARA_PES = 3.28084;
    private static final double LITROS_PARA_GALOES = 0.264172;
    private static final double QUILOS_PARA_LIBRAS = 2.20462;


    public static double converterMetrosParaPes(double metros){

        return metros*METROS_PARA_PES;
    }
    
    public static double converterLitrosParaGaloes(double galoes){

        return galoes*LITROS_PARA_GALOES;
    }
    public static double converterQuilosParaLibras(double quilo){

        return quilo*QUILOS_PARA_LIBRAS;
    }
}


/*2) Implementar o conceito de Herança dado pelo diagrama a seguir: */