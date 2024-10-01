package heranca02;

public abstract class Pessoa {
	protected String nome;
	protected int idade;
	protected String sexo;
	
	// metodo final
	public void fazerAniversario() {
		this.idade++;
	}
	
	public String dadosPrincipais() {
		return "\nNome: " + getNome() +  "\nIdade: " + getIdade() + "\nSexo: " + getSexo();
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public void pagarMensalidade() {
		// TODO Auto-generated method stub
		
	}
	
	
}
