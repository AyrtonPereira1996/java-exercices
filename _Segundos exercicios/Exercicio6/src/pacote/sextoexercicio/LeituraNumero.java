package pacote.sextoexercicio;

import java.util.Scanner;

public class LeituraNumero {

	void LeituraNumero() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Insira um numero : ");
		int numero = scanner.nextInt();
		
		System.out.println("Numero : " + numero);
		System.out.println("Seu antecessor : " + (numero - 1));
		System.out.println("Seu sucessor : " + (numero + 1));
	}
	
	public static void main(String[] args) {
		
		LeituraNumero numero = new LeituraNumero();
		numero.LeituraNumero();
	}

}
