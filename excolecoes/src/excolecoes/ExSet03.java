package excolecoes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ExSet03 {
	public static void main(String[] args) {
		
	    Scanner leia = new Scanner(System.in);

		Set<Integer> numeros = new HashSet<>();

		for (int num = 0; num < 10; num++) {
			System.out.println("Digite um numero inteiro: ");
		    int valor = leia.nextInt();
		    numeros.add(valor);
		}

		System.out.println("\nListar dados do Set: ");
		
		Iterator<Integer> itNum = numeros.iterator();
		
		while (itNum.hasNext()) {
			System.out.println(itNum.next());
		}

		leia.close();
		        
	}

}
