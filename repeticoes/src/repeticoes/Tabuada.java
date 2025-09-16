package repeticoes;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um numero inteiro: ");
		numero = leia.nextInt();
		
		//vai fazer até chegar no 10, depois sai do laço
		//contador++ é para ir aumentando por passagem e não cair em um loop infinito
		for(int contador = 1; contador <= 10; contador++) {
			System.out.printf("%d x %d = %d%n", numero, contador, numero * contador);
		}
		
		leia.close();
		
	}

}
