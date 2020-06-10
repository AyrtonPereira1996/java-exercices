package pacote.segundoexercicio;

public class NumeroDecrescente {
	boolean fim = false;

	/* Metodo para a contagem regressiva */
	void contagemDecrescente(int num) {

			if (num <= 0) {
				System.out.println("Por favor insira número maior e diferente de 0!");
			} else if (num > 0) {
				int cont;
				System.out.println("Inicio da contagem regressiva");
				for (cont = num; cont >= 0; cont--) {
					System.out.println("Contagem em " + cont);
				}
				System.out.println("Fim da contagem regressiva");
			}

	}

	/* Metodo principal */
	public static void main(String[] args) {
		NumeroDecrescente contagem = new NumeroDecrescente();
		contagem.contagemDecrescente(0);

	}

}
