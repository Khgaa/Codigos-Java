package principal;

import java.util.Scanner;
import lista.Lista;
import basica.Cantor;

public class Principal {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Lista lista = new Lista();
		
		for(int i = 0; i < 3; i++) {
			Cantor c = new Cantor();
			
			System.out.print("Digite o nome do cantor: ");
			c.setNome(in.next());
			System.out.print("Digite o tipo da música: ");
			c.setTipo(in.next());
			System.out.println();
			lista.addStart(c);
		}
		
		lista.verificar();
		lista.quantidade();
		lista.menu();

	}

}
