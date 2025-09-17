package vetores;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ExemploVetor {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		String nomes[] = {"Cintia", "Stella", "Patricia", "Rafaela", "Leticia", "Jamila", "Priscila"};
		
		int numeros[] = new int[5];
		
		System.out.println("Listagem - Vetor de Nomes");
		
		//Ordenar o vetor - Arrays
		//Deixar em ordem alfabetica
		Arrays.sort(nomes);
		//Inverter a ordem - só funciona com obejtivo (string é objeto)
		Arrays.sort(nomes, Collections.reverseOrder());
		
		for(int indice = 0; indice < nomes.length; indice++) {
			System.out.printf("nomes[%d] = %s%n", indice, nomes[indice]);
		}
		
		System.out.println("\nUnput de dados - Vetor de Numeros");
		for(int indice = 0; indice < numeros.length; indice++) {
			System.out.println("Digite um numero: ");
			numeros[indice] = leia.nextInt();
		}
		
		System.out.println("\nListagem - Vetor de Numeros");
		for(int indice = 0; indice < numeros.length; indice++) {
			System.out.printf("numeros[%d] = %s%n", indice, numeros[indice]);
		}

		leia.close();
		
	}
	
}