package principal;

import java.util.List;

public class Produto {
	private int id;
	private String nome;
	private String descricao;
	private List<Produto> produtos; 
	private Item item;
	private String codigoBarras;
	private double valor;
	
	public Produto() {
	}
	
	public Produto(int id, String nome, String descricao, List<Produto> produtos, Item item,String codigoBarras, double valor) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.produtos = produtos;
        this.item = item;
        this.codigoBarras = codigoBarras;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProduto(List<Produto> produtos) {
        this.produtos = produtos;
    }
    
    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
    
    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }
    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
	}


