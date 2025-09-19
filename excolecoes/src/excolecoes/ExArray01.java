package excolecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ExArray01 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        ArrayList<String> cores = new ArrayList<>();
        
        for (int quantidade = 0; quantidade < 5; quantidade++) {
            System.out.println("Digite uma cor: ");
            String cor = leia.nextLine();
            cores.add(cor);
        }

        System.out.println("\nListar todas as cores:");
        for (String cor : cores) {
            System.out.println(cor);
        }

        Collections.sort(cores);

        System.out.println("\nOrdenar as cores:");
        for (String cor : cores) {
            System.out.println(cor);
        }

        leia.close();
    }
}

