package principal;

import java.util.Scanner;

public class Repeticao {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String frase;
		
		System.out.print("Digite a frase que ser� repetida: ");
		frase = input.nextLine();
		
		System.out.print("Digite a quantidade de vezes que ser� repetida: ");
		int quantidade = input.nextInt();
		
		int contador = 0;
		
		while(contador <= quantidade) {
			System.out.println(frase + "\n");
			contador = contador + 1;
		}
	}

}

