import java.util.Scanner;

//CLASSE DO EXERCICIO 2.19.
public class Lampada100Estados extends LampadaTresEstados {
	private String estadoLuminosidade;
	private int valorLuminosidade;

	public void controloLuminosidade(int valorLuminosidade) {
		this.valorLuminosidade = valorLuminosidade;
		this.setValorLuminosidade(valorLuminosidade);
		this.estadoLuminosidade = estadoLuminosidade(valorLuminosidade);
		
		System.out.println("A lampada esta com o valor de " + valorLuminosidade + "%, que corresponde a " + estadoLuminosidade);

	}

	private String estadoLuminosidade(int valorLuminosidade) {
		String estadoLuminosidadeLampada;
		if (valorLuminosidade == 0) {
			System.out.println("A lampada esta apagada");
			estadoLuminosidadeLampada = "Apagada";
			return estadoLuminosidadeLampada;
			
		} else if (valorLuminosidade > 0 || valorLuminosidade <= 50) {
			System.out.println("A lampada esta em meia luz");
			estadoLuminosidadeLampada = "Meia-luz";
			return estadoLuminosidadeLampada;
			
		} else {
			System.out.println("Lampada esta acesa");
			estadoLuminosidadeLampada = "Acesa";
			return estadoLuminosidadeLampada;
		}
	}

	public String getEstadoLuminosidade() {
		return estadoLuminosidade;
	}

	public void setEstadoLuminosidade(String estadoLuminosidade) {
		this.estadoLuminosidade = estadoLuminosidade;
	}

	public int getValorLuminosidade() {
		return valorLuminosidade;
	}

	public void setValorLuminosidade(int valorLuminosidade) {
		this.valorLuminosidade = valorLuminosidade;
	}

}
