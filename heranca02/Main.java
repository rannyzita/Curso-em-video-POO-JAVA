package heranca02;

public class Main {

	public static void main(String[] args) {
		// testando a classe pobre, que não tem nada implementado
		Visitante visitante = new Visitante();
		
		visitante.setNome("Vitória");
		visitante.setIdade(17);
		visitante.setSexo("Feminino");
		
		System.out.println(visitante.toString());
		
		Aluno aluno = new Aluno();
		
		aluno.setCurso("Engenharia de Software");
		aluno.setMatricula(202312345);
		aluno.setNome("João da Silva");
		aluno.setIdade(22);
		aluno.setSexo("Masculino");
		
		aluno.dadosAluno();
		
		Bolsista bolsista = new Bolsista();
		
		bolsista.setNome("Alicya");
		bolsista.setSexo("Feminino");
		bolsista.setIdade(15);
		
		aluno.pagarMensalidade();
		bolsista.pagarMensalidade();
		
	}
}
