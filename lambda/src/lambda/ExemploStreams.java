package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStreams {

	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		 
		List<Integer> numerosDesordenados = Arrays.asList(6,7,8,1,4,5,9,10,2,3);
 
		List<String> estados = Arrays.asList("São Paulo", "Rio de Janeiro", "Minas Gerais","Espirito Santo", 
		"São Paulo", "Rio de Janeiro", "Minas Gerais", "São Paulo", "Rio de Janeiro", "rio grande do sul");
		
		List<Integer> numerosPares = numeros.stream()
				.filter(n -> n % 2 == 0)
				.collect(Collectors.toList());
		
		//Não altera a coleção original
		System.out.println("Números pares: " + numerosPares);
		
		//Coleção Original
		System.out.println("Colecao original: " + numeros);
		
		estados.stream()
			//Vai pegar e, e tranformar em E, e dai puxar qual começa com R, pq e é de Estados (estados.stream)
			.filter(e -> e.toUpperCase().startsWith("R"))
			.distinct() //serve para ignorar os repetidos
			.forEach(System.out::println);
			//System.out::println vai exibir tudo que filtrou, e não da para usar com List
		
		//Math retorna double e numeros é int, por isso é difirente esse aqui
		//1 alternativa - mudar a coleção para double
		List<Double> numerosAoCubo = numeros.stream()
				.map(n -> Math.pow(n,  3))
				.collect(Collectors.toList());
		
		System.out.println("Numero elevados ao cubo (double): " + numerosAoCubo);
		
		//2 alternativa - tranformar em inteiros depois
		List<Integer> numerosAoCuboInteiros = numeros.stream()
				.map(n -> (int)Math.pow(n,  3))
				.collect(Collectors.toList());
		
		System.out.println("Numero elevados ao cubo (Integer): " + numerosAoCuboInteiros);
		
		List<Integer> numerosOrdenados = numerosDesordenados.stream()
				.sorted()
				.collect(Collectors.toList());
		
		System.out.println("Numeros Ordenados: " + numerosOrdenados);
		
		long estadosIniciandoEmR = estados.stream()
		.filter(e -> e.toUpperCase().startsWith("R"))
		.distinct()
		.count();
		
		System.out.println("Total de Estados iniciados com a letra R: " + estadosIniciandoEmR);

	}

}