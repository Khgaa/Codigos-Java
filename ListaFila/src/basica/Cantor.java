package basica;

public class Cantor {
	
	private String nome;
	private String tipo;
	
	
	public Cantor(String nome, String tipo) {
		super();
		this.nome = nome;
		this.tipo = tipo;
	}
	
	public Cantor() {}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Cantor [nome=" + nome + ", tipo=" + tipo + "]";
	}
	
	
	

}
