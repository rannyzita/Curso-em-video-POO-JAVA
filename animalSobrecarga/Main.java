package animalSobrecarga;

public class Main {

	public static void main(String[] args) {
		Mamifero mamifero = new Mamifero();
		Lobo lobo = new Lobo();
		Cachorro cachorro = new Cachorro();
		
		lobo.emitirSom();
		cachorro.emitirSom();
		
		cachorro.reagir(false);
		cachorro.reagir(true);
		
		cachorro.reagir("ola");
	}

}
