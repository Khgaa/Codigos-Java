package Vetores;

public class Aluno {
	
	
	String nome;
	String matricula;
	
	
	public Aluno(String nome, String matricula) {
		super();
		this.nome = nome;
		this.matricula = matricula;
	}
	
	public Aluno() {
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", matricula=" + matricula + "]";
	}
	
	
	
	
	
	

}
