package pacote.terceiroexercicio;


public class SomaParesImpares {

	void somaMultiplicacao() {

		/* variaveis locais */
		int totalSoma = 0;
		int totalMultiplicacao = -1;
		
		/* estrutura que ira analisar os numeros de 0 ate 30 */
		for (int cont = 1; cont <= 30; cont++) {

			if ((cont % 2) == 0) {
				System.out.print("Par = " + cont + "," + "\n");
				totalMultiplicacao *= cont;

			} else if ((cont % 2) != 0) {
				System.out.print("Impar = " + cont + "," );
				totalSoma += cont;		
			}
		}
		
		System.out.println("\nNúmeros impares somados: " + totalSoma);
		System.out.println("Números pares multiplicados: " + totalMultiplicacao);

	}

	public static void main(String[] args) {
		SomaParesImpares operacao = new SomaParesImpares();
		operacao.somaMultiplicacao();
	}

}
