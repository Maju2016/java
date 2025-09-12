package operadores;

public class Unario {

	public static void main(String[] args) {

		int preIncrementoOriginal = 8, preIncrementoResultado;
		int posIncrementoOriginal = 8, posIncrementoResultado;
		
		System.out.printf("Pre Incremento: valor original = %d%n", preIncrementoOriginal);
		preIncrementoResultado = ++preIncrementoOriginal;
		System.out.printf("Apos pre incrementar a variável original: resultado = %d, Valor Atualizado = %d%n", preIncrementoResultado, preIncrementoOriginal);
	
		System.out.println();
		
		System.out.printf("Pos Incremento: valor original = %d%n", posIncrementoOriginal);
		posIncrementoResultado = posIncrementoOriginal++;
		System.out.printf("Apos pos incrementar a variável original: resultado = %d, Valor Atualizado = %d%n", posIncrementoResultado, posIncrementoOriginal);
	}

}
