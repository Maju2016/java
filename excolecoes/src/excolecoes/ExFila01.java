package excolecoes;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExFila01 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

	    Queue<String> fila = new LinkedList<>();

	    int opcao;

	    do {
	    	System.out.println("=================================");
	        System.out.println(" 1 - Adicionar Cliente na Fila");
	        System.out.println(" 2 - Listar todos os Clientes");
	        System.out.println(" 3 - Retirar Cliente da Fila");
	        System.out.println(" 0 - Sair");
	        System.out.println("=================================");
	        System.out.print("Entre com a opcao desejada: ");
	        opcao = leia.nextInt();
	        leia.nextLine();

	        switch (opcao) {
	        	case 1:
	        		System.out.print("Digite o nome do cliente: ");
	                String cliente = leia.nextLine();
	                fila.add(cliente);
	                System.out.println("Cliente adicionado!");
	                break;

	        	case 2:
	        		if (fila.isEmpty()) {
	        			System.out.println("A fila esta vazia!");
	                } 
	        		else {
	        			System.out.println("Lista de clientes na fila:");
	                    for (String lista : fila) {
	                    	System.out.println("- " + lista);
	                    }
	                }
	        		break;

	        	case 3:
	        		if (fila.isEmpty()) {
	        			System.out.println("A fila esta vazia!");
	        		} 
	        		else {
	        			String chamado = fila.poll();
	                    System.out.println("O cliente " + chamado + " foi chamado: ");
	        		}
	                break;

	        	case 0:
	        		System.out.println("Programa finalizado!");
	                break;

	        	default:
	        		System.out.println("Opcao invalida! Digite outra opcao.");
            }

        } while (opcao != 0);

        leia.close();
    }
}
