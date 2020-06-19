package pacote.segundoexercicio;

import java.util.Scanner;

public class MediaAritmetrica {

	/* calculo da media dos valores 8, 9, e 7 */
	int calcMediaA() {
		int x = 8;
		int y = 9;
		int z = 7;
		int mediaA = (x + y + z) / 3;
		return mediaA;

	}

	/* calculo da media dos valores 4, 5, e 6 */
	int calcMediaB() {
		int x = 4;
		int y = 5;
		int z = 6;
		int mediaB = (x + y + z) / 3;
		return mediaB;
	}

	/* Soma das duas medias */
	int SomaMedias() {
		int mediaA = calcMediaA();
		int mediaB = calcMediaB();

		int somaMedia = mediaA + mediaB;

		return somaMedia;
	}

	/* Calculo da media das medias */
	int calcMedia() {
		int somaMedia = SomaMedias();
		int mediaMedias = somaMedia / 2;
		return mediaMedias;

	}

	/* Programa principal */
	void mainCalcMedia() {
		boolean fim = false;
		
		String resp;
		String resp2;
		Scanner input = new Scanner(System.in);

		while (!fim) {
			boolean sair = false;
			System.out.println("Por favor escolha uma opcao:");
			System.out.println("A. Imprimir medias aritmetrica");
			System.out.println("B. Somar medias");
			System.out.println("C. Obter media das medias");
			resp = input.next();

			switch (resp) {

			case "a":
				while (!sair) {
					System.out.println("Escolha os valores cujo a media deseja que seja imprimida");
					System.out.println("A. 8, 9, e 7");
					System.out.println("B. 4, 5, e 6");
					resp2 = input.next();

					if (resp2.equalsIgnoreCase("a")) {
						System.out.println("O valor da media de 8, 9 e 7 é " + calcMediaA());
					}
					if (resp2.equalsIgnoreCase("b")) {
						System.out.println("O valor da media de 4, 5, e 6  é " + calcMediaB());
					} else if (!resp2.equalsIgnoreCase("a") && !resp2.equalsIgnoreCase("b")) {
						System.out.println("Resposta invalida");
					}
					System.out.println("Deseja repetir?S/N");
					String resp3 = input.next();

					if (resp3.equalsIgnoreCase("s")) {
						sair = false;
					}
					if (resp3.equalsIgnoreCase("n")) {
						sair = true;
					
					}
					if (!resp3.equalsIgnoreCase("s") && !resp3.equalsIgnoreCase("n")) {
						System.out.println("Resposta invalida");
						sair = false;
					}
				}
				break;
			case "b":

				System.out.println("A soma das medias é " + SomaMedias());
				System.out.println("");
				sair = true;
				break;

			case "c":
				System.out.println("A media das medias é " + calcMedia());
				System.out.println("");
				sair = true;
				break;

			default:
				System.out.println("Resposta invalida");
				break;
			}
			
		}
	}

	public static void main(String[] args) {
		MediaAritmetrica calcMediaAritmetrica = new MediaAritmetrica();
		calcMediaAritmetrica.mainCalcMedia();
	}

}
