package exlacos;

import java.util.Scanner;

public class Ex201 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int produto, quantidade, preco, conta;

		System.out.println("========================================");
		System.out.println("				Produtos				");
		System.out.println("========================================");
		System.out.println("          1- Cachorro Quente            ");	
		System.out.println("          2- X-Salada                   ");	
		System.out.println("          3- X-Bacon                    ");	
		System.out.println("          4- Bauru                      ");	
		System.out.println("          5- Refrigerante               ");	
		System.out.println("          6- Suco de Laranja            ");	
		System.out.println("========================================");
		
		System.out.println("Digite o numero do produto: ");
		produto = leia.nextInt();
		
		System.out.println("Digite a quantidade comparada: ");
		quantidade = leia.nextInt();
		
		

		
		switch(produto) {
		case 1:
			System.out.println("Produto: Cachorro quente");
			preco = 10;
			conta = preco * quantidade;
			System.out.printf("Valor total: %d.00", conta);
			break;
		
		case 2:
			System.out.println("Produto: X-Salada");
			preco = 15;
			conta = preco * quantidade;
			System.out.printf("Valor total: %d.00", conta);
			break;
			
		case 3:
			System.out.println("Produto: X-Bacon");
			preco = 18;
			conta = preco * quantidade;
			System.out.printf("Valor total: %d.00", conta);
			break;
			
		case 4:
			System.out.println("Produto: Bauru");
			preco = 12;
			conta = preco * quantidade;
			System.out.printf("Valor total: %d.00", conta);
			break;
			
		case 5:
			System.out.println("Produto: Refrigerante");
			preco = 8;
			conta = preco * quantidade;
			System.out.printf("Valor total: %d.00", conta);
			break;
			
		case 6:
			System.out.println("Produto: Suco de Laranja");
			preco = 13;
			conta = preco * quantidade;
			System.out.printf("Valor total: %d.00", conta);
			break;
			
		default:
			System.out.println("Opcao invalida");
		}		
		
		leia.close();		
	}

}
