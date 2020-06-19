package pacote.terceiroexercicio;

import java.util.Scanner;

public class ReajusteSaldo {

	@SuppressWarnings("resource")
	void reajusteSaldo() {
		Scanner entrada = new Scanner(System.in);
		int saldo;
		int saldoReajustado;
		
		System.out.print("Informe saldo por favor: ");
		saldo = entrada.nextInt();
		saldoReajustado = calculoReajustamento(saldo);
		System.out.println("Saldo reajustado a 1% = " + saldoReajustado);
	}
	
	int calculoReajustamento(int saldo) {
		int novoSaldo;
		novoSaldo = (saldo * 1) / 100;
		return novoSaldo;
	}
	public static void main(String[] args) {
		ReajusteSaldo saldo = new ReajusteSaldo();
		saldo.reajusteSaldo();

	}

}
