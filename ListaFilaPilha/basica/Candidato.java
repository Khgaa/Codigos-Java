package basica;

public class Candidato {
	
	private String nome;
	private String cargo;
	
	public Candidato(String nome, String cargo) {
		super();
		this.nome = nome;
		this.cargo = cargo;
	}
	
	public Candidato() {}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	@Override
	public String toString() {
		return "Candidato [nome=" + nome + ", cargo=" + cargo + "]";
	}
	
	

}
