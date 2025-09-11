package helloworld;

import java.util.Scanner;

public class Variaveis {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o peso: ");
		int peso = leia.nextInt();
		
		System.out.println("Digite uma letra: ");
		char opcao = leia.next().charAt(0);
		//charAt(0) - o 0 faz só pegar a primeira coisa digitada
		
		System.out.println("Digite o valor: ");
		float valor = leia.nextFloat();
		
		System.out.println("O valor da variavel peso é " + peso);
		
		System.out.println("O valor da variavel opção é: " + opcao);
		
		System.out.printf("O valor da variavel é: %.2f \n", valor);
		//print é diferente, e nao usa + para variavel
		
		leia.close();
	}

}
