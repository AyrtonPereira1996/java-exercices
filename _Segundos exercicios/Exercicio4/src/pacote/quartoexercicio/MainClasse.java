package pacote.quartoexercicio;

import java.util.Scanner;

public class MainClasse {

	void mainMetodo() {
		Scanner entrada = new Scanner(System.in);
		Peca p1 = new Peca("1983XC", 3, 150);
		Peca p2 = new Peca("1293XT", 4, 200);
		float valorFinal = calcFormula(p1, p2);

		System.out.println("Producto 1 : Código da peça -> " + p1.getCodigo() + ", Quantidade -> " + p1.getQuantidade()
				+ ", Valor -> " + p1.getValor());
		System.out.println("Producto 2 : Código da peça -> " + p2.getCodigo() + ", Quantidade -> " + p2.getQuantidade()
				+ ", Valor -> " + p2.getValor());
		System.out.println("Valor final -> " + valorFinal);

	}

	float calcFormula(Peca p1, Peca p2) {
		int ipi = 5;
		float valorFinal = (p1.getValor() * p1.getQuantidade() + p2.getValor() * p2.getQuantidade()) * (ipi / 100 + 1);

		return valorFinal;
	}

	public static void main(String[] args) {
		MainClasse mainClasse = new MainClasse();
		mainClasse.mainMetodo();
	}

}
