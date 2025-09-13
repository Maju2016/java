package exjavaope;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		float salario, adicional, horas, descontos;
		
		System.out.println("Digite seu Salario Bruto: ");
		salario = leia.nextFloat();
		
		System.out.println("Digite o Adicional Noturno: ");
		adicional = leia.nextFloat();
		
		System.out.println("Digite o valor da suas Horas Extras ");
		horas = leia.nextFloat();
		
		System.out.println("Digite os Descontos: ");
		descontos = leia.nextFloat();
		
		System.out.printf("O salario liquido é de: %.2f", salario + adicional + (horas * 5) - descontos);
		
		leia.close();
		
	}

}
