package principal;

import java.util.List;

public class Item {

	private int id;
	private int quantidade;
	private Pedido pedido;
	private Produto produto;
	private double subTotal;
	private List<Item> itens;
	
	public Item() {
	}
	
	public Item(int id, int quantidade, Pedido pedido, Produto produto, double subTotal) {
        this.id = id;
        this.quantidade = quantidade;
        this.pedido = pedido;
        this.produto = produto;
        this.subTotal = subTotal;
	}
	
	public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    
    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }
    
		
		

	}


