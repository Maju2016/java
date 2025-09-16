package exlacos;

import java.util.Scanner;

public class Ex202 {

	public static void main(String[] args) {
		
		//ERRADO

		Scanner leia = new Scanner(System.in);

		int cargo;
		String nome;
		float salario, conta, reajuste;

		System.out.println("========================================");
		System.out.println("				Cargo    				");
		System.out.println("========================================");
		System.out.println("          1- Gerente                    ");	
		System.out.println("          2- Vendedor                   ");	
		System.out.println("          3- Supervisor                 ");	
		System.out.println("          4- Motorista                  ");	
		System.out.println("          5- Estoquista                 ");	
		System.out.println("          6- Tecnico de TI              ");	
		System.out.println("========================================");
		
		System.out.println("Digite o seu cargo: ");
		cargo = leia.nextInt();
		
		System.out.println("Digite o seu nome: ");
		leia.skip("\\R");
		nome = leia.nextLine();
		
		System.out.println("Digite seu salario: ");
		salario = leia.nextFloat();
		
		System.out.printf("Nome: ", nome);
		
		switch(cargo) {
		case 1:
			System.out.println("Cargo: Gerente");
			reajuste = 0.10f;
			conta = salario + (reajuste * salario);
			System.out.printf("Valor total: %.2f", conta);
			break;
		
		
		default:
			System.out.println("Opcao invalida");
		}		
		
		leia.close();
		
	}

}
