package Vetores;


import java.util.ArrayList;
import java.util.List;

public class Vetor {
	
	private Object obj[] = new Object[3];
	private int totalobj = 0;
	List<Aluno> lista = new ArrayList<Aluno>();
	

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
}

