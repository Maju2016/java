package exlacos;

import java.util.Scanner;

public class ex101 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		float num1, num2, num3, conta;
		
		System.out.println("Digite o primeiro numero: ");
		num1 = leia.nextFloat();
		
		System.out.println("Digite o segundo numero: ");
		num2 = leia.nextFloat();
		
		System.out.println("Digite o terceiro numero: ");
		num3 = leia.nextFloat();
		
		conta = num1 + num2;
		
		if(conta > num3) {
			System.out.println("A soma do primeiro + segundo é Maior do que o terceiro!");
		}
		else if(conta == num3) {
			System.out.println("A soma do primeiro + segundo é igual ao terceiro!");
		}
		else {
			System.out.println("A soma do primeiro + segundo é menor do que o terceiro!");
		}
		
		leia.close();
		
	}

}
