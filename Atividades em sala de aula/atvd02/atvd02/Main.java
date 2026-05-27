package atvd02;

public class Main {
   public static void main(String[] args) {
      System.out.println("------RESULTADO DO ANO ELETIVO-------");

      Aluno kayky = new Aluno("Kayky", 118030, 5, 7, 70);
      System.out.println("Nome: "+kayky.getNome());
      System.out.println("RA: "+kayky.getRa());
      System.out.println("Resultado: "+kayky.getMedia());
      
      System.out.println("-------------");

      Aluno joao = new Aluno("Joao", 119060, 1, 7, 30);
      System.out.println("Nome: "+joao.getNome());
      System.out.println("RA: "+joao.getRa());
      System.out.println("Resultado: "+joao.getMedia());

      System.out.println("-------------");

      Aluno luan = new Aluno("Luan", 145623, 5, 2, 70);
      System.out.println("Nome: "+luan.getNome());
      System.out.println("RA: "+luan.getRa());
      System.out.println("Resultado: "+luan.getMedia());

      System.out.println("-------------");

      Aluno gabriela = new Aluno("Gabriela", 152325, 5, 7, 50);
      System.out.println("Nome: "+gabriela.getNome());
      System.out.println("RA: "+gabriela.getRa());
      System.out.println("Resultado: "+gabriela.getMedia());

      System.out.println("-------------");

      Aluno flavia = new Aluno("Flávia", 16587, 5, 7, 70);
      System.out.println("Nome: "+flavia.getNome());
      System.out.println("RA: "+flavia.getRa());
      System.out.println("Resultado: "+flavia.getMedia());

   }
}
