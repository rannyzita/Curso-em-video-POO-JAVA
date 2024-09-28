package biblioteca;

public class Livro implements Publicacao {
	private String titulo;
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
		this.titulo = titulo;
		this.autor = autor;
		this.totPaginas = totPaginas;
		this.aberto = false;
		this.pagAtual = 0;
		this.leitor = leitor;
	}
	
	public String detalhes() {
		return "Livro [titulo=" + titulo + "\n, autor=" + autor + "\n, totPaginas=" + totPaginas + ", pagAtual=" + pagAtual
				+ "\n, aberto=" + aberto + "\n, leitor=" + leitor.getNome() + "\n, idade=" + leitor.getIdade() + "]";
	}

	public String getLivro() {
		return titulo;
	}

	public void setLivro(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getTotPaginas() {
		return totPaginas;
	}

	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}

	public int getPagAtual() {
		return pagAtual;
	}

	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}

	public boolean isAberto() {
		return aberto;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	public Pessoa getLeitor() {
		return leitor;
	}

	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}

	@Override
	public void abrir() {
		if (!isAberto()) {
			this.aberto = true;
		}
		
	}
	@Override
	public void fechar() {
		if (isAberto()) {
			this.aberto = false;
		}
	}
	
	@Override
	public void folhear(int pagina) {
		if (pagina > getTotPaginas() || pagina < 0) {
			System.out.println("\nPágina não existe.");
			this.pagAtual = 0;
		} else  if (pagina == 0){
			this.pagAtual = 0;
			System.out.println("\nPágina Inicial.");
		} else {
			this.pagAtual = pagina;
		}
		
	}
	@Override
	public void avancarPag() {
		if (getTotPaginas() > 0 && getTotPaginas() >= getPagAtual()) {
			this.pagAtual++;
		}
		
	}
	@Override
	public void voltarPag() {
		if (getTotPaginas() > 0) {
			this.pagAtual--;
		}
		
	}
}
