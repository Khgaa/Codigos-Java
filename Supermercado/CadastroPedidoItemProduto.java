package principal;

import java.util.ArrayList;
import java.util.Date;

public class CadastroPedidoItemProduto {

	public static void main(String[] args) {
		ArrayList<Produto> listaDeProdutos = new ArrayList<>();
		ArrayList<Item> listaDeItens = new ArrayList<>();
		
		Produto p1 = new Produto();
		p1.setId(433);
		p1.setNome("Guarda-chuva");
		p1.setDescricao("Para dias de chuva");
		p1.setCodigoBarras("234567567");
		p1.setValor(20.00);
		
		Produto p2 = new Produto();
		p2.setId(242);
		p2.setNome("Queijo mussarela");
		p2.setDescricao("Queijo de marca");
		p2.setCodigoBarras("987654353");
		p2.setValor(6.00);
		
		Produto p3 = new Produto();
		p3.setId(123);
		p3.setNome("Ketchup");
		p3.setDescricao("Ketchup de marca");
		p3.setCodigoBarras("3546374365");
		p3.setValor(8.00);
		
		listaDeProdutos.add(p1);
		listaDeProdutos.add(p2);
		listaDeProdutos.add(p3);
		
		Item ite1 = new Item();
		ite1.setId(433);
		ite1.setQuantidade(1);
		ite1.setSubTotal(20.00);
		
		Item ite2 = new Item();
		ite2.setId(242);
		ite2.setQuantidade(4);
		ite2.setSubTotal(24.00);
		
		Item ite3 = new Item();
		ite3.setId(123);
		ite3.setQuantidade(2);
		ite3.setSubTotal(16.00);
		
		listaDeItens.add(ite1);
		listaDeItens.add(ite2);
		listaDeItens.add(ite3);
		
		
		Pedido ped = new Pedido();
		ped.setId(23);
		ped.setProdutos(listaDeProdutos);
		ped.setItens(listaDeItens);
		ped.setValorFrete(100.00);
		ped.setValorDesconto(0.00);
		ped.setValorCupom(0.00);
		ped.setValorTotal(160.00);
		ped.setData(new Date());
		
		System.out.println("Produtos:");
		//for each
		for(Produto p : ped.getProdutos()) {
		System.out.println("Id: " + p.getId());
		System.out.println("Nome: " + p.getNome());
		System.out.println("Descrição: " + p.getDescricao());
		System.out.println("CodigoBarras: " + p.getCodigoBarras());
		System.out.println("Valor: " + p.getValor());
		System.out.println("");
		}
		
		//for each
		for(Item i : ped.getItens()) {
		System.out.println("Id: " + i.getId());
		System.out.println("Quantidade: " + i.getQuantidade());
		System.out.println("Sub total: " + i.getSubTotal());
		System.out.println("");
		}
		
		System.out.println("Valor do frete: " + ped.getValorFrete());
		System.out.println("Valor do desconto: " + ped.getValorDesconto());
		System.out.println("Valor do cupom: " + ped.getValorCupom());
		System.out.println("Valor total: " + ped.getValorTotal());
		System.out.println("Data: " + ped.getData());
		

	}

}

