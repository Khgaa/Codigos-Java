package br.edu.ifba.linked;

import java.util.LinkedList;
import java.util.Scanner;
import br.edu.ifba.basica.Contato;


public class Ligada {
	
	int totalQuantidade;
	
	Scanner in = new Scanner(System.in);
	
	LinkedList<Contato> lista = new LinkedList<Contato>();
	
	public void adicionarNoInicio(Contato c) {
		
		lista.addFirst(c);
		this.totalQuantidade++;
	}
	
	public void adicionarNoFinal(Contato c) {
		
		if(lista.isEmpty()) {
			this.adicionarNoInicio(c);
		}else {
			lista.addLast(c);
			this.totalQuantidade++;
		}
	}
	
	public boolean verificaPosicao(int pos) {
		return pos >= 0 && pos < lista.size();
	}
	
	public void adicionarPorPosicao(int pos, Contato c) {
		
		if(!this.verificaPosicao(pos)) {
			System.out.println("Posi��o inv�lida");
		}else if(lista.isEmpty()) {
			this.adicionarNoInicio(c);
		}else {
			lista.add(pos, c);
			this.totalQuantidade++;
		}
		
	}
	
	public void removerNoInicio() {
		
		if(lista.isEmpty()) {
			System.out.println("A lista est� vazia");
		}else {
			lista.removeFirst();
			this.totalQuantidade--;
		}
		
	}
	
	public void removerNoFinal() {
		
		if(lista.isEmpty()) {
			System.out.println("A lista est� vazia");
		}else {
		    lista.removeLast();
		    this.totalQuantidade--;
		}
	}
	
	public void removerPorPosicao(int pos) {
		
		if(!this.verificaPosicao(pos)) {
			System.out.println("Posi��o inv�lida");
		} else if(lista.isEmpty()) {
			System.out.println("A lista est� vazia");
		}else {
			lista.remove(pos);
			this.totalQuantidade--;
		}
		
	}
	
	public void imprimir() {
		
		System.out.println("A quantidade de posi��es � de: " + lista.toString());
	}
	
	public void quantidade() {
		
		System.out.println(totalQuantidade);
	}
	
public void menu() {
		
		System.out.println("O que voc� deseja fazer?");
		System.out.println();
		System.out.println("Digite 0 para adicionar um contato no come�o");
		System.out.println("Digite 1 para adicionar um contato no final");
		System.out.println("Digite 2 para adicionar um contato em uma posi��o espec�fica");
		System.out.println("Digite 3 para remover o contato no come�o");
		System.out.println("Digite 4 para remover o contato no final");
		System.out.println("Digite 5 para remover um contato de uma posi��o espec�fica");
		System.out.println("Digite 6 para terminar");
		System.out.println();
		System.out.print("Digite um n�mero: ");
		int num = in.nextInt();
		System.out.println("");
		
		if(num == 0) {
			
			Contato c = new Contato();
			System.out.print("Digite o nome do contato: ");
			c.setNome(in.next());
			System.out.print("Digite o n�mero do contato: ");
			c.setFone(in.next());
			System.out.println();
			adicionarNoInicio(c);
			imprimir();
			System.out.println();
			quantidade();
			menu();
			
		}
		
		if(num == 1) {
			
			Contato c = new Contato();
			System.out.print("Digite o nome do contato: ");
			c.setNome(in.next());
			System.out.print("Digite o n�mero do contato: ");
			c.setFone(in.next());
			System.out.println();
			adicionarNoFinal(c);
			imprimir();
			System.out.println();
			quantidade();
			menu();
			
		}
		
		if(num == 2) {
			
			System.out.println("N�mero de posi��es: " + this.totalQuantidade);
			System.out.print("Digite o n�mero da posi��o que voc� quer adicionar: ");
			int pos = in.nextInt();
			
			Contato c = new Contato();
			System.out.print("Digite o nome do contato: ");
			c.setNome(in.next());
			System.out.print("Digite o n�mero do contato: ");
			c.setFone(in.next());
			System.out.println();
			adicionarPorPosicao(pos, c);
			imprimir();
			System.out.println();
			quantidade();
			menu();
		}
		
		if(num == 3) {
			
			removerNoInicio();
			imprimir();
			System.out.println();
			quantidade();
			menu();
		}
		
		if(num == 4) {
			
			removerNoFinal();
			imprimir();
			System.out.println();
			quantidade();
			menu();
		}
		
		if(num == 5) {
			
			System.out.println("N�mero de posi��es: " + this.totalQuantidade);
			System.out.print("Digite o n�mero da posi��o que voc� quer remover: ");
			int pos2 = in.nextInt();
			
			removerPorPosicao(pos2);
			imprimir();
			System.out.println();
			quantidade();
			menu();
			
		}
		
		if(num == 6) {
			
			System.out.println("Obrigado, tenha um bom dia");
			
	}

}

}
