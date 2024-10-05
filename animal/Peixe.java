package animal;

public class Peixe extends Animal {
	private String corEscama;
	
	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}

	@Override
	public void locomover() {
		System.out.println("\nNadando");
	}

	@Override
	public void alimentar() {
		System.out.println("\nComendo substâncias");
	}

	@Override
	public void emitirSom() {
		System.out.println("\nPeixe não faz som");
	}
	
	public void soltarBolha() {
		System.out.println("\nSoltou uma bolha");
	}
	
	
}
