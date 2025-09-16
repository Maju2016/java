package exrepeticao;

import java.util.Scanner;

public class ExWhile03 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int m21 = 0, M50 = 0;
		int idade = 1;
		
		while (idade > 0) {
			System.out.println("Digite uma idade: ");
			idade = leia.nextInt();
			if(idade < 21 && idade > 0) {
				m21++;
			}
			if(idade > 50) {
				M50++;
			}
		}
		
		
		
		System.out.printf("Total de pessoas menores de 21 anos: %d%n", m21);
		System.out.printf("Total de pessoas maiores de 50 anos: %d%n", M50);
		
		leia.close();
		
	}

}
