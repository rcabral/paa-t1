package br.puc.rio;

public class TestaMergeSort {
	
	public static void main(String[] args) {
		
		double[] numeros = {
				4,
				8.5,
				10,
				3,
				6.7,
				7,
				9,
				5, 
				9.3
		};
		
		
		ordena(numeros,0, numeros.length);
		
		for (double numero : numeros) {
			System.out.println(numero);
		}
	
	}

	private static void ordena(double[] numeros, int inicial, int termino) {
		
		int quantidade = termino - inicial;

		if (quantidade > 1) {
			int meio = (inicial + termino) / 2;
			ordena(numeros, inicial, meio);
			ordena(numeros, meio, termino);
			intercala(numeros, inicial, meio, termino);
		}
	}

	private static void intercala(double[] numeros, int inicial, int miolo, int termino) {
		double[] resultado = new double[termino - inicial];
		
		int atual = 0;
		int atual1 = inicial;
		int atual2 = miolo;
		
		
		while (atual1 <  miolo && atual2 < termino) {
			double numero1 = numeros[atual1];
			double numero2 = numeros[atual2];
						
			if(numero1 < numero2) {
				resultado[atual] = numero1;
				atual1++;
			}else {
				resultado[atual] = numero2;
				atual2++;
			}
			atual ++;
		}
		
		while(atual1 <  miolo) {
			resultado[atual] = numeros[atual1];
			atual1++;
			atual ++;
		}
		
		while(atual2 <  termino) {
			resultado[atual] = numeros[atual2];
			atual2++;
			atual ++;
		}
		
		for (int contador = 0; contador < atual; contador++) {
			numeros[contador + inicial] = resultado[contador];
		}
		
	}
	
	
	
	
	

}
