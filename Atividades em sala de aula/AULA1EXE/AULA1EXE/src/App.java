import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        float A1, A2, media;
        int presenca;
        Scanner ler = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.printf("aluno:%d\n", i + 1);

            System.out.println("Informe sua nota A1:");
            A1 = ler.nextFloat();

            System.out.println("Informe sua nota A2:");
            A2 = ler.nextFloat();

            media = (A1 + (2 * A2)) / 3;

            System.out.println("Informe sua porcentagem de presença:");
            presenca = ler.nextInt();

             

            System.out.printf("sua média: %.2f\n", media);
            if (presenca >= 75 && media >= 5) {
                System.out.printf("Aprovado\n");

            } else if (presenca >= 75 && 3 <= media) {
                System.out.printf(" RE\n");
            } else if (presenca < 75) {
                System.out.printf(" reprovado\n");
            }
        }
        ler.close();
    }

}
