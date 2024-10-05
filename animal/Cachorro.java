package animal;

public class Cachorro extends Mamifero{
	@Override
	public void locomover() {
		System.out.println("\nAndando");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("\nAU AU AU");
	}
}
