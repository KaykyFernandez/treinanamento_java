//2) Faça um programa em Java que contenha uma classe Aluno.
//- Todo Aluno possui Nome, RA, Nota A1, Nota A2, Média e Frequência nas
//aulas.
//- A média do aluno deve ser calculada utilizando um método chamado Calcular
//Média. O cálculo da média é feito da seguinte maneira:
//Média = (A1 + (2*A2)) / 3
//- O método chamado Situação do Aluno, deve mostrar, a partir da média do
//aluno, se ele está Aprovado, RE ou Reprovado:

//Caso a presença seja maior que 75% e a média >= 5 o aluno

//está “Aprovado”.
//Caso a presença seja maior que 75% e a 3<=média<5 o aluno está de
//“RE”.
//Caso o aluno tenha menos de 75% de presença ou nota menor que 3,
//está “Reprovado”.
//Caso a presença seja menor que 75% o alunos está “Reprovado por
//Faltas”.
//Utilizando os conceitos de Classe, Objetos, Atributos, Métodos e
//Encapsulamento, crie um programa para satisfazer as especificações acima.
//No programa principal, crie 5 alunos distintos, defina os valores dos atributos,
//calcule as médias dos alunos e imprima na tela as informações de cada um

package atvd02;

public class Aluno{

   private String nome;
   private int ra;
   private int a1;
   private int a2;
   private int freq;

   public Aluno(String n, int  r, int a, int b, int f) {
      this.nome = n;
      this.ra= r;
      this.a1 = a;
      this.a2 = b;
      this. freq = f;}
      
   
   public String getNome() {
      return this.nome;
   }
   public int getRa(){
      return this.ra;
   }

   public String getMedia() {
      double media = (a1 + (2 * a2)) / 3;

      if (freq >= 70 && media >= 5) {
         return "passou";
      }else{
        return "reprovou";
      }
   }
   

}

