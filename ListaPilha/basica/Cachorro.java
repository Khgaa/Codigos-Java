package basica;

public class Cachorro {
	
	private String nome;
	private String especie;
	
	
	public Cachorro(String nome, String especie) {
		super();
		this.nome = nome;
		this.especie = especie;
	}
	
	public Cachorro() {}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}

	@Override
	public String toString() {
		return "Cachorro [nome=" + nome + ", especie=" + especie + "]";
	}
	
	

}
