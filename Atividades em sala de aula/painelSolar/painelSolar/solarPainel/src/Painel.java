public class Painel {
	private int id;
	private double kw;
	
	
	public Painel(int id, double kw) {
		this.id = id;
		this.kw = kw;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getKw() {
		return kw;
	}

	public void setKw(double kw) {
		this.kw = kw;
	}

	public double gerarEnergia(){
		return  kw;

	}


	
	
}