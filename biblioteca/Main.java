package biblioteca;

public class Main {

	public static void main(String[] args) {
		Pessoa[] pessoa = new Pessoa[2];
		Livro[] livro = new Livro[3];
		
		pessoa[0] = new Pessoa("Ranny", 17, "Feminino");
		pessoa[1] = new Pessoa("Yarlla", 17, "Feminino");
		
		livro[0] = new Livro("Harry Potter", "Jk", 450, pessoa[0]);
		livro[1] = new Livro("Galinha Pintadinha", "Michael", 100, pessoa[0]);
		livro[2] = new Livro("Css e Html", "Levy", 23, pessoa[1]);
		
		livro[0].abrir();
		livro[0].folhear(100);
		livro[0].avancarPag();
		livro[0].fechar();
		System.out.println(livro[0].detalhes());
	}

}
