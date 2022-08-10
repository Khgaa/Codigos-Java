package br.edu.ifba.principal;

import java.util.Scanner;

import br.edu.ifba.basica.Contato;
import br.edu.ifba.linked.Ligada;

public class Principal {

	public static void main(String[] args) {
		
	    Ligada lista = new Ligada();
        Scanner in = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {
			
			Contato c = new Contato();
			System.out.print("Digite o nome do contato: ");
			c.setNome(in.next());
			System.out.print("Digite o número do contato: ");
			c.setFone(in.next());
			System.out.println();
			lista.adicionarNoInicio(c);
	}
		lista.menu();

  }
}
