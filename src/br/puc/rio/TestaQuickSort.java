package br.puc.rio;

public class TestaQuickSort {
	
	public static void main(String[] args) {

		
		double[] numeros = {
				4,
				8.5,
				10,
				3,
				6.7,
				9.3,
				9,
				5, 
				7
		};
		
		ordena(numeros,0,numeros.length);
			
		
		for (int atual = 0; atual < numeros.length; atual++) {
			System.out.println(numeros[atual]);
		}
	}

	
	

	private static void ordena(double[] numeros, int de, int ate) {
		int elementos = ate - de;
		if(elementos > 1) {
			int posicaoDoPivo = particiona(numeros, de, ate);
			ordena(numeros, de, posicaoDoPivo);
			ordena(numeros, posicaoDoPivo + 1, ate);
		}
	}
	
	
	private static int particiona(double[] numeros, int inicial, int termino) {
		int menoresEncontrados= 0;
		double pivo = numeros[termino -1];
		
		for (int analisando = 0; analisando < termino -1 ; analisando++) {
				double atual = numeros[analisando];		
				if(atual <= pivo ) {
					troca(numeros,analisando,menoresEncontrados);
					menoresEncontrados++;
				}
		}
		troca(numeros,termino -1,menoresEncontrados);
		
		return menoresEncontrados;
	}

	private static void troca(double[] numeros, int de, int para) {
		double numero1 = numeros[de];
		double numero2 = numeros[para];
		numeros[para] = numero1;
		numeros[de] = numero2;
	}
	
	
	
	
	
	
	
	
	
	

}
