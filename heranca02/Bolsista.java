package heranca02;

public class Bolsista extends Pessoa{
	private int bolsa;
	
	public void renovarBolsa() {
		System.out.println("\nRenovando bolsa do " + this.nome);
	}
	
	@Override
	public void pagarMensalidade() {
		System.out.println(this.nome + " é bolsista! Pagamento gratuito!");
	}

	public int getBolsa() {
		return bolsa;
	}

	public void setBolsa(int bolsa) {
		this.bolsa = bolsa;
	}
	
}
