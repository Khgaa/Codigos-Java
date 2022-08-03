package principal;

import lista.Lista;

public class Principal {

	public static void main(String[] args) {
		
		Lista lista = new Lista();
		
		lista.adicionaNoComeco("Igor");
		lista.adicionaNoComeco("Maria");
		lista.adicionaNoComeco("Fulano");
		lista.adicionaNoComeco("Sicrano");
		lista.adicionaNoComeco("Beltrano");
		lista.adicionaNoComeco("José");
		lista.adicionaNoComeco("Camila");
		lista.adicionaNoComeco("Helena");
		
		
		System.out.println(lista.toString());
		
		lista.adicionaNoFinal("João");
		lista.adicionaNoFinal("Teste");
		
		System.out.println(lista.toString());
		
		lista.adicionaPosicao(8, "Marcos");
		
		System.out.println(lista.toString());
		
		lista.removerNoComeco();
        
		System.out.println(lista.toString());

	}

}
