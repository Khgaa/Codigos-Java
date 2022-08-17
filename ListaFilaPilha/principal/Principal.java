package principal;

import basica.Candidato;
import lista.FilaPilha;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		FilaPilha b = new FilaPilha();
		
       for(int i = 0; i < 3; i++) {
			
			Candidato c = new Candidato();
			System.out.print("Digite o nome do candidato: ");
			c.setNome(in.next());
			System.out.print("Digite o cargo do candidato: ");
			c.setCargo(in.next());
			System.out.println();
			b.adicionar(c);
		}
       
       b.mostrar();
       
       b.inverter();
       
       b.mostrar();

	}

}
