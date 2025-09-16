package exrepeticao;

import java.util.Scanner;

public class ExFor1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int num1, num2;
		
		System.out.println("Digite o primeiro numero inteiro: ");
		num1 = leia.nextInt();
		
		System.out.println("Digite o segundo numero inteiro: ");
		num2 = leia.nextInt();
		
		if (num1 < num2) {
			for(int intervalo = num1; intervalo < num2; intervalo++) {
				if (intervalo % 3 == 0 && intervalo % 5 == 0) {
					System.out.printf("%d é multiplo de 3 e 5%n", intervalo);
				}
				
			}
		}
		else if (num1 > num2){
			System.out.println("Intervalo invalido!");
		}
		
		leia.close();
		
	}

}
