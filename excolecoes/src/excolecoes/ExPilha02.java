package excolecoes;

import java.util.Scanner;
import java.util.Stack;

public class ExPilha02 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        Stack<String> pilha = new Stack<>();

        int opcao;

       do {
           System.out.println("=================================");
           System.out.println(" 1 - Adicionar Livro na Pilha");
           System.out.println(" 2 - Listar todos os Livros");
           System.out.println(" 3 - Retirar Livro da Pilha");
           System.out.println(" 0 - Sair");
           System.out.println("=================================");
           System.out.print("Digite uma opcao: ");
           opcao = leia.nextInt();
           leia.nextLine(); 

           switch (opcao) {
	       	case 1:
	       		System.out.print("Digite o nome do livro: ");
	            String livro = leia.nextLine();
	            pilha.push(livro); 
	            System.out.println("Livro adicionado!");
	            break;

	        case 2:
	        	if (pilha.isEmpty()) {
	        		System.out.println("A pilha esta vazia!");
	            } 
	        	else {
	        		System.out.println("Lista de livros na pilha:");
	                for (String lista : pilha) {
	                	System.out.println("- " + lista);
	                 }
	            }
	            break;

	        case 3:
	        	if (pilha.isEmpty()) {
	        		System.out.println("A pilha esta vazia!");
	            } 
	        	else {
	        		pilha.pop();
	                System.out.println("Um livro foi retirado da pilha!");
	            }
	            break;

	         case 0:
	        	 System.out.println("Programa finalizado!");
	             break;

	         default:
	        	 System.out.println("Opcaoo invalida! Digite outra opcao");
	         }

       } while (opcao != 0);

	   leia.close();
	
	}

}
