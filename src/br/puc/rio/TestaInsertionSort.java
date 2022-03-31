package br.puc.rio;

public class TestaInsertionSort {
	
	public static void main(String[] args) {
		double[] numeros = {
			    1000000,
			    46000,
			    16000,
			    46000,
			    17000
		};
		
		insertionSort(numeros, numeros.length);
		imprime(numeros);
	}

	private static void insertionSort(double[] numeros, int quantidadeDeElementos) {
		for (int atual = 1; atual < quantidadeDeElementos; atual++) {
			int analise = atual;
			while (analise > 0  && (numeros[analise] < numeros[analise - 1])) {
				troca(numeros, analise, analise - 1);
				analise--;
			}
		}
	}


	private static void troca(double[] numeros, int primeiro, int segundo) {
		double primeiroNumero = numeros[primeiro];
		double segundoNumero = numeros[segundo];
		
		numeros[primeiro] = segundoNumero;
		numeros[segundo] = primeiroNumero;
	}
	
	
	private static void imprime(double[] numeros) {
		for (double numero : numeros) {
			System.out.println(numero);
		}
	}
	


}
