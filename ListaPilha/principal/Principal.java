package principal;

import java.util.Scanner;
import basica.Cachorro;
import lista.Pilha;

public class Principal {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Pilha p = new Pilha();
		
		for(int i = 0; i < 3; i++) {
			
			Cachorro c = new Cachorro();
			System.out.print("Digite o nome do cachorro: ");
			c.setNome(in.next());
			System.out.print("Digite a espécie do cachorro: ");
			c.setEspecie(in.next());
			System.out.println();
			p.adicionar(c);
		}
		
		p.mostrar();
		p.verificar();
		p.menu();

	}

}
