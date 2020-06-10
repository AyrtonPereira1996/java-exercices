package pacote.quartoexercicio;

import java.util.Scanner;

public class TrocaNumero {

	/*Método que ira permitir receber o dados e mostrar*/
	void trocaNumero() {
		@SuppressWarnings("resource")
		Scanner entr = new Scanner(System.in); 
		int numA, numB;
		
		System.out.print("Digite o primeiro número : ");
		numA = entr.nextInt();
		System.out.print("\nDigite o segundo número : ");
		numB = entr.nextInt();
		System.out.println("");
		
		System.out.print("NumA = " + numB + "\n");
		System.out.println("NumB = " + numA);
	}
	
	/*Método principal*/
	public static void main(String[] args) {
	TrocaNumero trocaNumero = new TrocaNumero();
	trocaNumero.trocaNumero();

	}

}
