package Escola;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Servico {
	
	private Object obj[] = new Object[3];
	List<Aluno> lista = new ArrayList<Aluno>();
	Scanner in = new Scanner(System.in);
	
	
	public void add(Aluno c) {
		
		lista.add(c);
	}
	
	public void addPos(int pos, Aluno c) {
		
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
	}
	
	public void quantidade() {
		
		System.out.println("A quantidade de alunos matriculados é de: " + lista.size());
	}
	
	public void menu() {
		
		System.out.println("O que você deseja fazer?");
		System.out.println();
		System.out.println("Digite 0 para adicionar mais alunos");
		System.out.println("Digite 1 para remover um aluno");
		System.out.println("Digite 2 para remover o último aluno adicionado");
		System.out.println("Digite 3 para terminar");
		System.out.println();
		System.out.print("Digite um número: ");
		int num = in.nextInt();
		
if(num == 0) {
			
			System.out.print("Digite a posição em que você deseja cadastrar o aluno: ");
			int pos = in.nextInt();
			
			Aluno a = new Aluno();
			
			System.out.print("Digite o nome do aluno cadastrado: ");
			a.setNome(in.next());
			System.out.print("Digite a matrícula desse aluno: ");
			a.setMatricula(in.next());
			
			addPos(pos, a);
			list();
			quantidade();
			menu();
			
		}
		
		if(num == 1) {
			
			System.out.print("Digite o número da posição que você deseja apagar: ");
			int pos2 = in.nextInt();
			
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
			
			System.out.println("Sistema finalizado, tenha um bom dia");
		}
		
	}
	

}
