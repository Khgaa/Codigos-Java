package lista;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import basica.Candidato;

public class FilaPilha {
	
	Queue<Candidato> fila = new LinkedList<Candidato>();
	Stack<Candidato> pilha = new Stack<Candidato>();
	
	public void adicionar(Candidato c) {
		
		fila.add(c);
	}
	
	public void inverter() {
		
		for(int i = 0; i < fila.size(); i++) {
		   System.out.println(fila.remove());
		   pilha.push(fila.remove());

		}	
		
		for(int i = 0; i < pilha.size(); i++) {
			
			   fila.add(pilha.pop());
		}

	}
	
	public void mostrar() {
		
		System.out.println(fila.toString());
	}

}
