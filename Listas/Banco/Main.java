package Banco;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //cria lista 
        List<Pessoa> listaPessoas = new ArrayList<>();
        
        //.add adiciona item na lista
        Pessoa p1 = new Pessoa(1,"Kayky", 400.00);
        Pessoa p2 = new Pessoa(2,"Flavia", 400.00);
        Pessoa p3 = new Pessoa(3,"Joao", 400.00);
        listaPessoas.add(p1);
        listaPessoas.add(p2);
        listaPessoas.add(p3);
        

        //size fala o tamanho da lista
        //System.out.println(listaPessoas.size());
        //foreach para imprimir a lista 
        for (Pessoa p : listaPessoas){
            System.out.println(p);
        }

        //foreach para imprimir a lista 
        for (Pessoa p : listaPessoas){
            System.out.println(p);
        }
        
        System.out.println("---------------");
        //aponta index do item pelo valor guardado nele 
        System.out.println("Index of Lista: " + listaPessoas.indexOf(2) );
        System.out.println("Index of Junas: " + listaPessoas.indexOf("Junas") );
        
        //System.out.println("----------------");
        //id da pessoa que deseja aumentar o salario
        int idDesejavel = 1;
        //lista criada para filtrar items pelo caracter desejavel
       List<Pessoa> result = listaPessoas.stream()
       .filter(p -> p.getId() ==idDesejavel)
       .collect(Collectors.toList());
        for (Pessoa p : result){
            //atribui aumento ao id desejavel
            p.aumento(10.0);
           System.out.println(p);
        }
       ;
   }
}

