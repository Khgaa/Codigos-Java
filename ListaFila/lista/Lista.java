package lista;

import java.util.LinkedList;

import basica.Cantor;
import java.util.Scanner;

public class Lista {
	
	Scanner in = new Scanner(System.in);
	int totalElementos;
	LinkedList<Cantor> lista = new LinkedList<Cantor>();
	
	public void removeFinal() {
		
		if(lista.isEmpty()) {
			System.out.println("A lista est� vazia");
		}
		lista.removeLast();
		this.totalElementos--;
	}
	
	public void addStart(Cantor c) {
		
		lista.addFirst(c);
		this.totalElementos++;
	}
	
	public void quantidade() {
		
		System.out.println("A quantidade de posi��es � de: " + totalElementos);
	}
	
	public void verificar() {
		
		System.out.println(lista.toString());
	}
	
public void menu() {
		
		System.out.println("O que voc� deseja fazer?");
		System.out.println();
		System.out.println("Digite 0 para adicionar um cantor no come�o");
		System.out.println("Digite 1 para remover o cantor no final");
		System.out.println("Digite 2 para terminar");
		System.out.println();
		System.out.print("Digite um n�mero: ");
		int num = in.nextInt();
		System.out.println("");
		
		if(num == 0) {
			
			Cantor c = new Cantor();
			System.out.print("Digite o nome do cantor: ");
			c.setNome(in.next());
			System.out.print("Digite o tipo da m�sica: ");
			c.setTipo(in.next());
			System.out.println();
			addStart(c);
			verificar();
			System.out.println();
			quantidade();
			menu();
			
		}
		
		if(num == 1) {
			
			removeFinal();
			verificar();
			System.out.println();
			quantidade();
			menu();
			
		}
		
		if(num == 2) {
			
			System.out.println("Obrigado, tenha um bom dia");
		}
		
		

}

}
