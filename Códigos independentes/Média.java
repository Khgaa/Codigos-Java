package principal;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		
		int nota1;
		int nota2;
		int nota3;
	    
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe a primeira nota: ");
		nota1 = input.nextInt();
		
		System.out.println("Informe a segunda nota: ");
		nota2 = input.nextInt();
		
		System.out.println("Informe a terceira nota: ");
		nota3 = input.nextInt();
		
		int media = (nota1 + nota2 + nota3)/3;
		
		System.out.println("Sua nota final �: " + media);
		
		if(media >= 7) {
			System.out.println("Parab�ns, voc� est� aprovado!");
		}else if(media >= 5 && media < 7) {
			System.out.println("Voc� est� de recupera��o");
		}else if(media < 5) {
			System.out.println("Sinto muito, mas voc� foi reprovado");
		}
	}

}
