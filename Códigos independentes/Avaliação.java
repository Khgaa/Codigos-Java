package principal;

import java.util.Scanner;

public class Avaliacao {

	public static void main(String[] args) {

		double aval;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite de 1 à 5, o quanto você nos avalia: ");
		aval = input.nextDouble();
		
		if(aval == 1) {
			System.out.println("Você classificou como péssimo o nosso atendimento, obrigado!");
		}else if(aval == 2) {
			System.out.println("Você classificou como ruim o nosso atendimento, obrigado!");
		}else if(aval == 3) {
			System.out.println("Você classificou como bom o nosso atendimento, obrigado!");
		}else if(aval == 4) {
			System.out.println("Você classificou como muito bom o nosso atendimento, obrigado!");
		}else if(aval == 5) {
			System.out.println("Você classificou como ótimo o nosso atendimento, obrigado!");
		}else if(aval < 1 || aval > 5) {
			System.out.println("Desculpe, só aceitamos valores de 1 até 5");
	    }

  }
}
