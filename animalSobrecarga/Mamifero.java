package animalSobrecarga;

public class Mamifero extends Animal{
	protected String corPelo;

	@Override
	public void emitirSom() {
		System.out.println("\nSom de mamifero");	
	}
	
	
}
