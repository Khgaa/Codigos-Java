package Oficina;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Servico s = new Servico();
		Scanner in = new Scanner(System.in);
		
		
		for(int cont = 0; cont < 3; cont++) {
			
			Cliente c = new Cliente();
			
			System.out.print("Digite o nome do cliente: ");
		    c.setNome(in.next());
		    System.out.print("Digite o modelo do carro: ");
		    c.setCarro(in.next());
		    System.out.println("");
		    s.add(c);
		    
		}
		
		s.list();
		s.quantidade();
		s.menu();

	}

}
