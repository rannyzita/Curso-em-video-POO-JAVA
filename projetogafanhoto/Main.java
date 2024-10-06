package projetogafanhoto;

public class Main {

	public static void main(String[] args) {
		Video video[] = new Video[3];
		
		video[0] = new Video("Aula 1 de POO");
		video[1] = new Video("Aula 2 de POO");
		video[2] = new Video("Aula 3 de POO");
		
		Gafanhoto gafanhoto[] = new Gafanhoto[2];
		gafanhoto[0] = new Gafanhoto("Ranny", 17, "F", "Rannydograu");
		gafanhoto[1] = new Gafanhoto("Paula", 20, "F", "Jujuba");
		
		Vizualizacao vizualizacao[] = new Vizualizacao[2];
		vizualizacao[0] = new Vizualizacao(gafanhoto[0], video[0]);
		vizualizacao[0].avaliar();
		System.out.println(vizualizacao[0].mostrarInformacoes());
		/*System.out.println("VIDEOS\n----------");
		System.out.println(video[0].mostrarInformacoes());
		System.out.println(video[1].mostrarInformacoes());
		System.out.println(video[2].mostrarInformacoes());
		System.out.println("\nGafanhotos\n---------");
		System.out.println(gafanhoto[0].mostrarInformacoes());
		System.out.println(gafanhoto[1].mostrarInformacoes());*/
	}

}
