package exjavaope;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		float salario, abono;
		
		System.out.println("Digite o Salario: ");
		salario = leia.nextFloat();
		
		System.out.println("Digite o Abono: ");
		abono = leia.nextFloat();
		
		System.out.printf("O novo salario é de: %.2f", salario + abono);
		
		leia.close();

	}

}
