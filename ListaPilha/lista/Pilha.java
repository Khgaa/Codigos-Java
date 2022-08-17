package lista;

import java.util.Stack;
import basica.Cachorro;
import java.util.Scanner;

public class Pilha {
	
	Scanner in = new Scanner(System.in);
	Stack<Cachorro> pilha = new Stack<Cachorro>();
	
	public void adicionar(Cachorro c) {
		
		pilha.push(c);
	}
	
	public void remover() {
		
		if(pilha.isEmpty()) {
			System.out.println("A pilha está vazia!");
		} else {
		     pilha.pop();
		}
	}
	
	public void verificar() {
		
		System.out.println("A quantidade de elementos é de: " + pilha.size());
	}
	
	public void mostrar() {
		
		System.out.println(pilha.toString());
	}
	
    public void menu() {
		
		System.out.println("O que você deseja fazer?");
		System.out.println();
		System.out.println("Digite 0 para adicionar um cachorro");
		System.out.println("Digite 1 para remover um cachorro");
		System.out.println("Digite 2 para terminar");
		System.out.println();
		System.out.print("Digite um número: ");
		int num = in.nextInt();
		System.out.println("");
		
		if(num == 0) {
			
			Cachorro c = new Cachorro();
			System.out.print("Digite o nome do cachorro: ");
			c.setNome(in.next());
			System.out.print("Digite a espécie do cachorro: ");
			c.setEspecie(in.next());
			System.out.println();
			adicionar(c);
			mostrar();
			System.out.println();
			verificar();
			menu();
			
		}
		
		if(num == 1) {
			
			remover();
			mostrar();
			System.out.println();
			verificar();
			menu();
			
		}
		
		if(num == 2) {
			
			System.out.println("Obrigado, tenha um bom dia");
		}
		
		

}

}
