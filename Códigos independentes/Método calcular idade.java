package principal;

import java.util.Scanner;

public class MatematicaUtil {

	public static void main(String[] args) {
		
		int nascimento;
		
		
        Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o ano em que você nasceu: ");
		nascimento = input.nextInt();
		
		int idade = calcularIdade(nascimento);
		
		System.out.print(idade);

	}
    
	
	public static int calcularIdade(int nascimento) {
		int idade = 2021 - nascimento;
		return idade;
	}
}
