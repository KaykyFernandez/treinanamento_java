package atvd03;

public class Conta {

	private String nomeTitular;
	private int numeroConta;
	private double deposito;
	private double saldo;
	private double saque;

	
	public Conta(String n, int t, double s, double d, double r) {
		nomeTitular = n;
		numeroConta = t;
		saldo = s;
		deposito = d;
	}
	
	public String getNome() {
		return nomeTitular;
	}
	
	public int getConta() {
		return numeroConta;
	}
	

	public double getSaldo(){
		return saldo;
	}
	
	public double setDeposito(double d){
		saldo += d;
		deposito = d;
		return deposito;
	}

	public double setSacar(double r){
		saldo = saldo - r;
		saque =r;
		return saque;

	}
	
	
}