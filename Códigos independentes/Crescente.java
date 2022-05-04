package principal;

import java.util.Scanner;

public class Crescente {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int contador = 100;
		
		while(contador <= 1000) {
			System.out.println(contador + "\n");
			contador = contador + 1;
		}
	}

}
