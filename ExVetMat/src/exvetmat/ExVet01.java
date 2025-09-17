package exvetmat;

import java.util.Scanner;

public class ExVet01 {

	public static void main(String[] args) {

Scanner leia = new Scanner(System.in);
		
		int encontrar;
		int numeros[] = new int[10];
		boolean achar = false;
		
		for(int indice = 0; indice < numeros.length; indice++) {
			System.out.println("Digite um numero: ");
			numeros[indice] = leia.nextInt();
		}
		
		System.out.println("Digite o numero que você deseja encontrar: ");
		encontrar = leia.nextInt();
				
		for(int indice = 0; indice < numeros.length; indice++) {
			if(numeros[indice] == encontrar) {
				System.out.printf("O numero %d esta localizado na posicao: %d", encontrar, indice);
				achar = true;
				break;
			}
		}	
		
		if(!achar) {
			System.out.printf("O numero %d não foi encontrado!", encontrar);
		}
		
		leia.close();
		
	}

}