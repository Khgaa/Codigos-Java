package principal;

import java.util.Scanner;

public class Decrescente {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int contador = 1000;
		
		while(contador >= 100) {
			System.out.println(contador + "\n");
			contador = contador - 1;
		}
	}

}