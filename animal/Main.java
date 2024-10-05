package animal;

public class Main {

	public static void main(String[] args) {
		Mamifero mamifero = new Mamifero();
		Reptil reptil = new Reptil();
		Peixe peixe = new Peixe();
		Ave ave = new Ave();
		Canguru canguru = new Canguru();
		Cachorro cachorro = new Cachorro();
		Cobra cobra = new Cobra();
		Tartaruga tartaruga = new Tartaruga();
		Goldfish goldfish = new Goldfish();
		Arara arara = new Arara();
		
		mamifero.setPeso(42.5f);
		mamifero.setCorPelo("Marrom");
		
		System.out.println(mamifero.getPeso());
		System.out.println(mamifero.getCorPelo());
		
		mamifero.alimentar();
		mamifero.locomover();
		reptil.locomover();
		peixe.locomover();
		ave.locomover();
		
		canguru.locomover();
		canguru.usandoBolsa();
		
		cachorro.locomover();
		cachorro.emitirSom();
	}

}
