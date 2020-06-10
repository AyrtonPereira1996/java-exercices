package pacote.sextoexercicio;

import java.util.Scanner;

public class MediaAluno {
	
	/*Estrutura composta que armazena notas*/
	int[] notas = new int[3];
	int auxi;

	@SuppressWarnings({ "unused", "resource" })
	/*Metodo que que colecta notas*/
	void colectarNotas() {
		Scanner entrada = new Scanner(System.in);
		
		for (int cont = 0; cont < notas.length; cont++) {
			System.out.print("Por favor insira a " + cont + "º nota : ");
			auxi = entrada.nextInt();
			if (auxi < 0 || auxi > 100) {
				System.err.println("O valor não é válido");
				System.out.println("Saindo do programa...");
				System.exit(-1);
			} else {
				notas[cont] = auxi;
			}
		}
		calcMedia(notas);	
	}
	
	/*Metodo que calcula media*/
	void calcMedia(int notas[]) {
		int media;
		media = (notas[0] + notas[1] + notas[2])/3;
		System.out.println("------- Notas dos testes -------");
		System.out.println("1º nota : " + notas[0] + " valores\n2º nota : " + notas[1] + " valores\n3º nota : " + notas[2] + " valores");
		System.out.println("--------------------------------");
		System.out.println("Media : " + media);
		System.out.println("Terminando...");
		System.exit(0);
	}
		
	/*Metodo principal*/
	public static void main(String[] args) {
		MediaAluno mediaAluno = new MediaAluno();
		mediaAluno.colectarNotas();
		

	}

}
