package principal;

import java.util.Scanner;

public class Avaliacao {

	public static void main(String[] args) {

		double aval;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite de 1 � 5, o quanto voc� nos avalia: ");
		aval = input.nextDouble();
		
		if(aval == 1) {
			System.out.println("Voc� classificou como p�ssimo o nosso atendimento, obrigado!");
		}else if(aval == 2) {
			System.out.println("Voc� classificou como ruim o nosso atendimento, obrigado!");
		}else if(aval == 3) {
			System.out.println("Voc� classificou como bom o nosso atendimento, obrigado!");
		}else if(aval == 4) {
			System.out.println("Voc� classificou como muito bom o nosso atendimento, obrigado!");
		}else if(aval == 5) {
			System.out.println("Voc� classificou como �timo o nosso atendimento, obrigado!");
		}else if(aval < 1 || aval > 5) {
			System.out.println("Desculpe, s� aceitamos valores de 1 at� 5");
	    }

  }
}
