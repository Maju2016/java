package exlacos;

import java.util.Scanner;

public class Ex203 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int codigo;
		float num1, num2;
		
		System.out.println("========================================");
		System.out.println("				Operacao   				");
		System.out.println("========================================");
		System.out.println("          1- Soma                       ");	
		System.out.println("          2- Subtracao                  ");	
		System.out.println("          3- Multiplicacao              ");	
		System.out.println("          4- Divisao                    ");	
		System.out.println("========================================");
		
		System.out.println("Digite o codigo da operacao desejada:");
		codigo = leia.nextInt();
		
		System.out.println("Digite o primeiro numero: ");
		num1 = leia.nextFloat();
		
		System.out.println("Digite o segundo numero: ");
		num2 = leia.nextFloat();
		
		switch(codigo) {
		case 1:
			System.out.printf("%.2f + %.2f = %.2f", num1, num2, num1 + num2);
			break;
			
		case 2:
			System.out.printf("%.2f - %.2f = %.2f", num1, num2, num1 - num2);
			break;
			
		case 3:
			System.out.printf("%.2f * %.2f = %.2f", num1, num2, num1 * num2);
			break;
			
		case 4:
			System.out.printf("%.2f / %.2f = %.2f", num1, num2, num1 / num2);
			break;
		
		default:
			System.out.println("Opcao invalida");
		}		
		
		leia.close();
		
	}

}
