package principal;

import java.util.Scanner;

public class Carrinho {

	public static void main(String[] args) {
		
		int distancia;
		int tempo;
		
		Scanner input = new Scanner(System.in);
		
	    System.out.print("Defina a dist�ncia do local desejado em km: ");
	    distancia = input.nextInt();
	    
	    System.out.print("Defina o tempo aproximado em horas: ");
	    tempo = input.nextInt();
	    
	    int velocidade = distancia/tempo;
	    
	    System.out.println("A velocidade m�dia de seu carro em km/h � de: " + velocidade);
	    

	}

}
