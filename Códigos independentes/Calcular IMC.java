package principal;

import java.util.Scanner;

public class Calculos {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double conversor1;
		double conversor2;
		

		
		System.out.print("Digite o seu peso: ");
		conversor1 = input.nextDouble();
		
		System.out.print("Digite a sua altura: ");
		conversor2 = input.nextDouble();
		
		System.out.println();
		
		calcular(conversor1, conversor2);
		
		if(calcular(conversor1, conversor2) < 18.5) {
			System.out.println("Você está abaixo do peso ideal" );
		}else if(calcular(conversor1, conversor2) >= 18.5 && calcular(conversor1, conversor2) <= 35) {
			System.out.println("Você está no peso ideal" );
		}else if(calcular(conversor1, conversor2) > 35) {
			System.out.println("Você está acima do peso ideal" );
		}
		

	}

	public static double calcular(double p, double h) {
		System.out.println(p/(h*h));
		return h;
		
		
		
	}
}
