package Vetores;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Vetor v = new Vetor();
		Scanner in = new Scanner(System.in);
		
		
		for(int cont = 0; cont < 3; cont++) {
		Aluno a = new Aluno();
		
		System.out.print("Digite o nome do aluno que você deseja cadastrar: ");
		a.setNome(in.next());
		System.out.print("Digite a matricula desse aluno: ");
        a.setMatricula(in.next());
     
        v.add(a);
        
		}
       
        v.list();
        
        System.out.print("Digite a posição em que você deseja cadastrar um novo aluno: ");
        int pos = in.nextInt();
        
        Aluno a = new Aluno();
        
        System.out.print("Digite o nome do aluno que você deseja cadastrar: ");
		a.setNome(in.next());
		System.out.print("Digite a matricula desse aluno: ");
        a.setMatricula(in.next());
        
        
        v.addPos(pos, a);
        
        v.list();
        
        System.out.println("Digite a posição que você quer apagar: ");
        int pos2 = in.nextInt();
        
        v.removePos(pos2);
        
        v.list();
        
        System.out.println("Você deseja apagar a última posição?");
        String cond = in.next();
        
        
        if(cond.equals("sim")) {
        	
        	v.remove();
        	
        	v.list();
        	
        }

		

	}

}
