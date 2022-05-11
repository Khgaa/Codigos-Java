package Oficina;

public class Cliente {
	
	String nome;
	String carro;
	
	
	public Cliente(String nome, String carro) {
		super();
		this.nome = nome;
		this.carro = carro;
		
	}
	
	public Cliente() {
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCarro() {
		return carro;
	}
	public void setCarro(String carro) {
		this.carro = carro;
	}
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", carro=" + carro + "]";
	}
	
	

}
