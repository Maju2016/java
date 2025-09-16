package exlacos;

import java.util.Scanner;

public class Ex102 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
				
		int num, descobrir;
		
		System.out.println("Digite um numero: ");
		num = leia.nextInt();
		
		descobrir = num % 2;
		
		if(descobrir == 0 && num > 0) {
			System.out.println("Esse numero e positivo e par.");
		}
		else if(descobrir == 1 && num > 0) {
			System.out.println("Esse numero e positivo e impar.");
		}
		else if(num < 0 && descobrir == 0){
			System.out.println("Esse numero e negativo e par.");
		}
		else {
			System.out.println("Esse numero e negativo e impar.");
		}
		
		leia.close();
			
	}

}
