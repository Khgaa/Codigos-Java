package Oficina;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Servico {
	
	Object obj[] = new Object[10];
	Scanner in = new Scanner(System.in);
	List<Cliente> lista = new ArrayList<Cliente>();
	
	
	public void add(Cliente c) {
		
		    lista.add(c);
	    }
		
	
	
	public void addPos(int pos, Cliente c) {
		
		lista.add(pos, c);
	}
	
	public void removePos(int pos) {
		
		lista.remove(pos);
	}
	
	public void remove() {
		
		lista.remove(lista.size()-1);
		
	}
	
	public void list() {
		
		System.out.println(lista);
		System.out.println("");
	}
	
	public void quantidade() {
		
		System.out.println("A quantidade de clientes é: " + lista.size());
		System.out.println("");
	}
	
	public void search() {
		
		System.out.print("O que você deseja procurar?");
		System.out.println("");
		System.out.println("Digite 0 para procurar por nome");
		System.out.println("Digite 1 para procurar por carro");
		System.out.println("Digite 2 para retornar ao menu");
		System.out.println("");
		System.out.print("Digite um número: ");
		System.out.println("");
		
		int number = in.nextInt();
		Cliente c = new Cliente();
		
		if(number == 0) {
			
			System.out.print("Digite o nome que você quer procurar: ");
			String nome = in.next();
			System.out.println("");
			
			for(int cont = 0; cont < lista.size(); cont++){
				
				if (lista.get(cont).getNome().equals(nome)) {
					
					System.out.println("Nome: " + lista.get(cont).getNome());
					System.out.println("Carro: " + lista.get(cont).getCarro());
					System.out.println("");
			}
				
			}
			}
			
		
			if(number == 1) {
				
				System.out.print("Digite o nome do carro que você quer procurar: ");
				String carro = in.next();
				System.out.println("");
				
				for(int cont = 0; cont < lista.size(); cont++){
					
					if (lista.get(cont).getCarro().equals(carro)) {
						
						System.out.println("Nome: " + lista.get(cont).getNome());
						System.out.println("Carro: " + lista.get(cont).getCarro());
						System.out.println("");
				}
					
			
				
			}
			}
			
			if(number == 2) {
				
				menu();
			}
		}
	
	public void menu() {
		
		System.out.println("O que você deseja fazer?");
		System.out.println();
		System.out.println("Digite 0 para adicionar mais clientes");
		System.out.println("Digite 1 para remover um cliente");
		System.out.println("Digite 2 para remover o último cliente adicionado");
		System.out.println("Digite 3 para procurar um cliente");
		System.out.println("Digite 4 para terminar");
		System.out.println();
		System.out.print("Digite um número: ");
		int num = in.nextInt();
		System.out.println("");
		
if(num == 0) {
			
			System.out.print("Digite a posição em que você deseja cadastrar o aluno: ");
			int pos = in.nextInt();
			System.out.println("");
			
			Cliente c = new Cliente();
			
			System.out.print("Digite o nome do cliente: ");
			c.setNome(in.next());
			System.out.print("Digite o modelo do carro: ");
			c.setCarro(in.next());
			System.out.println("");
			
			addPos(pos, c);
			list();
			quantidade();
			menu();
			
		}
		
		if(num == 1) {
			
			System.out.print("Digite o número da posição que você deseja apagar: ");
			int pos2 = in.nextInt();
			System.out.println("");
			
			removePos(pos2);
			list();
			quantidade();
			menu();
			
		}
		
		if(num == 2) {
			
			remove();
			list();
			quantidade();
			menu();
		}
		
		if(num == 3) {
			
			search();
			menu();
		}
		
        if(num == 4) {
			
			System.out.println("Sistema finalizado, tenha um bom dia");
		}
	}
	}


