package Escola;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Servico s = new Servico();
		Scanner in = new Scanner(System.in);
		
		for(int cont = 0; cont < 5; cont++) {
			
			Aluno a = new Aluno();
			
			System.out.print("Digite o nome do aluno cadastrado: ");
			a.setNome(in.next());
			System.out.print("Digite a matrícula desse aluno: ");
			a.setMatricula(in.next());
			
			s.add(a);
			
		}
		
		System.out.println();
		
		s.list();
		s.quantidade();
		
		System.out.println();
		
		s.menu();
		
		

	}

}
