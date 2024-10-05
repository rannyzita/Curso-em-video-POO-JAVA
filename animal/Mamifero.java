package animal;

public class Mamifero extends Animal {
	private String corPelo;

	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}

	@Override
	public void locomover() {
		System.out.println("\nCorrendo");
	}

	@Override
	public void alimentar() {
		System.out.println("\nMamando");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("\nSom de Mamífero.");
		
	}
	
	
}
