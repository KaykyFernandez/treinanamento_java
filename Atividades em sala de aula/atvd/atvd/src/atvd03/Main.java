package atvd03;

import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		Conta kayky = new Conta("Kayky Fernandes", 151, 0.0, 0.0,0.0);
		
		System.out.println("-----------------");
        System.out.println("Número da Conta: "+kayky.getConta());
		System.out.println("Nome do Titular: "+kayky.getNome());
        System.out.println("Saldo: "+kayky.getSaldo());
		System.out.println("-----------------");
        System.out.println("Deposito na conta "+kayky.getConta()+" no valor: R$"+kayky.setDeposito( 100.9)+" realizado com sucesso!");
        System.out.println("Deposito na conta "+kayky.getConta()+" no valor: R$"+kayky.setDeposito( 58.9)+" realizado com sucesso!");
        System.out.println("Saldo: "+kayky.getSaldo());
        System.out.println("Saque no valor: "+kayky.setSacar(10)+" realizado com sucesso!");
        System.out.println("-----------------");
        System.out.println("Número da Conta: "+kayky.getConta());
		System.out.println("Nome do Titular: "+kayky.getNome());
        System.out.println("Saldo: "+kayky.getSaldo());


        Conta flavia = new Conta("Flávia Souza", 168, 0.0, 0.0,0.0);

        System.out.println("-----------------");
        System.out.println("Número da Conta: "+flavia.getConta());
		System.out.println("Nome do Titular: "+flavia.getNome());
        System.out.println("Saldo: "+flavia.getSaldo());
		System.out.println("-----------------");
        System.out.println("Deposito na conta "+flavia.getConta()+" no valor: R$"+flavia.setDeposito( 58.9)+" realizado com sucesso!");
        System.out.println("Saldo: "+flavia.getSaldo());
        System.out.println("Saque no valor: "+flavia.setSacar(10)+" realizado com sucesso!");
        System.out.println("-----------------");
        System.out.println("Número da Conta: "+flavia.getConta());
		System.out.println("Nome do Titular: "+flavia.getNome());
        System.out.println("Saldo: "+flavia.getSaldo());
		System.out.println("-----------------");
        
		
		Conta lucas = new Conta("Lucas Silva", 154, 0.0, 0.0,0.0);

        System.out.println("-----------------");
        System.out.println("Número da Conta: "+lucas.getConta());
		System.out.println("Nome do Titular: "+lucas.getNome());
        System.out.println("Saldo: "+lucas.getSaldo());
		System.out.println("-----------------");
        System.out.println("Deposito na conta "+lucas.getConta()+" no valor: R$"+lucas.setDeposito( 70.9)+" realizado com sucesso!");
        System.out.println("Deposito na conta "+lucas.getConta()+" no valor: R$"+lucas.setDeposito( 58.9)+" realizado com sucesso!");
        System.out.println("Saldo: "+lucas.getSaldo());
        System.out.println("Saque no valor: "+lucas.setSacar(10)+" realizado com sucesso!");
        System.out.println("-----------------");
        System.out.println("Número da Conta: "+lucas.getConta());
		System.out.println("Nome do Titular: "+lucas.getNome());
        System.out.println("Saldo: "+lucas.getSaldo());
		System.out.println("-----------------");
		
	}

}
