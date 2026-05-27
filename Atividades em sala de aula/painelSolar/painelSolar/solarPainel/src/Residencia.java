import java.util.List;
import java.util.ArrayList;

public class Residencia {

	private int endereco;
	private double consumoEnergia;
	private List<Painel> paineis;

	public Residencia(int endereco, double consumoEnergia) {
		this.endereco = endereco;
		this.consumoEnergia = consumoEnergia;
		this.paineis = new ArrayList<Painel>();

		
	}

	public int getEndereco() {
		return endereco;
	} 

	public void addPainel(Painel painel){
		this.paineis.add(painel);
	}

	public void addPainel(List<Painel> paineis){
		for(Painel painel : this.paineis){
			this.paineis.add(painel);
		}
	}

	
}
/*
o calcularEnergiaGerada(): soma a energia gerada por todos os painéis.
o verificarConsumo(): informa se a energia gerada cobre o consumo da
residência.*/