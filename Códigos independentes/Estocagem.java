package principal;

import java.util.Scanner;

public class Estocagem {

	public static void main(String[] args) {

		String produto;
		double numero;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o nome do produto: ");
		produto = input.nextLine();
		
		System.out.print("Digite a quantia: ");
		numero = input.nextDouble();
		
		if(numero <= 10) {
			System.out.println("O estoque de " + produto + " está baixo" );
		}else if(numero > 10 && numero <= 20) {
			System.out.println("O estoque de " + produto + " está normal" );
		}else if(numero > 20) {
			System.out.println("O estoque de " + produto + " está excelente" );
		}
	}

}
