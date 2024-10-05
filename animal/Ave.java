package animal;

public class Ave extends Animal{
	private String corPena;
	
	public String getCorPena() {
		return corPena;
	}

	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}

	@Override
	public void locomover() {
		System.out.println("\nVoando");

	}

	@Override
	public void alimentar() {
		System.out.println("\nComendo frutas");
	}

	@Override
	public void emitirSom() {
		System.out.println("\nSom de ave");
		
	}
	
	public void fazerNinho() {
		System.out.println("\nConstruiu um ninho");
	}

}
