package principal;

import java.util.Scanner;

public class Ano {

	public static void main(String[] args) {
		
		int conversor;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o ano em que você nasceu: ");
		conversor = input.nextInt();
		

		
		
		anoDeNascimento(conversor);

	}
	
	public static void anoDeNascimento(int a) {
		System.out.println(2021-a);
	}

}
