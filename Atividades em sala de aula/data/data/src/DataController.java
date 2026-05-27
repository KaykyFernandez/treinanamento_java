import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class DataController {
    private int dia;
    private int mes;
    private int ano;

    public DataController(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

    }

    public DataController(int dia, int mes, int ano, String estação) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

    }

    public DataController() {
        LocalDate hoje = LocalDate.now();
        this.dia = hoje.getDayOfMonth();
        this.mes = hoje.getMonthValue();
        this.ano = hoje.getYear();
    }

    public void exibirData() {
        System.out.println("Data do Sistema: " + dia + "/" + mes + "/" + ano);
    }

    public void exibirData(int dia, int mes, int ano) {
        System.out.println("Data do fornecida: " + this.dia + "/" + this.mes + "/" + this.ano);
    }

    public void validaData() {
        if (dia > 30) {
            System.out.println("Dia invalido!");
            System.out.println("porfavor coloque um dia entre 1 a 30");

        } else if (dia <= 0) {
            System.out.println("Dia invalido!");
            System.out.println("porfavor coloque um dia entre 1 a 30");

        } else if (mes > 12) {
            System.out.println("Mês invalido!");
            System.out.println("porfavor coloque um dia entre 1 a 12");
        } else if (mes <= 0) {
            System.out.println("Mês invalido!");
            System.out.println("porfavor coloque um dia entre 1 a 12");
        } else {
            System.out.println("Data valida!");
        }
    }

    public String apresentaData(boolean mostrarEstacao) {

        String[] nomesMeses = {
                "janeiro", "fevereiro", "março", "abril", "maio", "junho",
                "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"
        };

        String dataFormatada = this.dia + " de " + nomesMeses[this.mes - 1] + " de " + this.ano;

        if (!mostrarEstacao) {
            return dataFormatada;
        }

        Map<Integer, String> estacoesBase = new HashMap<>();
        estacoesBase.put(1, "Verão");
        estacoesBase.put(2, "Verão");
        estacoesBase.put(4, "Outono");
        estacoesBase.put(5, "Outono");
        estacoesBase.put(7, "Inverno");
        estacoesBase.put(8, "Inverno");
        estacoesBase.put(10, "Primavera");
        estacoesBase.put(11, "Primavera");

        String estacaoFinal;

        if (estacoesBase.containsKey(this.mes)) {
            estacaoFinal = estacoesBase.get(this.mes);
        } else {
            // Meses de virada
            switch (this.mes) {
                case 3:
                    estacaoFinal = (this.dia >= 21) ? "Outono" : "Verão";
                    break;
                case 6:
                    estacaoFinal = (this.dia >= 21) ? "Inverno" : "Outono";
                    break;
                case 9:
                    estacaoFinal = (this.dia >= 23) ? "Primavera" : "Inverno";
                    break;
                case 12:
                    estacaoFinal = (this.dia >= 21) ? "Verão" : "Primavera";
                    break;
                default:
                    estacaoFinal = "Desconhecida";
            }
        }

        return dataFormatada + " - Estação: " + estacaoFinal;
    }

    public void avancData(int avanco) {
        boolean quanti = true;
        while (quanti) {
            if (avanco >= 30) {
                dia = 1;
                mes++;
                if (dia <= 0) {
                    dia = 1;
                }
                mes++;
                if (mes >= 12) {
                    mes = 1;
                    ano++;
                } else if (avanco < 30)
                    quanti = false;
            } else {
                dia += avanco;
            }

        }

    }

    public void avancdia() {
        if (dia >= 30) {
            dia = 1;

            mes++;
            if (mes >= 12) {
                mes = 1;
                ano++;
            }
        } else {
            dia++;
        }

    }

    /*
     * f. Forneça o método apresentaData para retornar uma representação
     * da data como string, além de mostrar a estação do ano. Nesse método deve
     * ser passado um valor booleano referente a estação do ano como parâmetro.
     * Se o parâmetro estação do ano passado for verdadeiro, imprima e data em
     * formato completo e a estação do ano correta, caso contrário somente a data
     * em formato completo. Considere que a data deve ser formatada no modo
     * completo mostrando o dia, o mês e o ano, como por exemplo: 19 de março de
     * 2025. Para facilitar a programação, considere as estações da seguinte forma:
     */

}
