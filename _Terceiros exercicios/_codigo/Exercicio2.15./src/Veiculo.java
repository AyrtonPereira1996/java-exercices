
//CLASSE DO EXERCICIO 2.15.
public class Veiculo {
	private String tipoVeiculo;
	private String modeloVeiculo;
	private int numeroPassageiros;
	private int numeroRodas;

	public void ligarVeiculo() {
		System.out.println("Ligando o veiculo...");
	}
	
	public void desligarVeiculo() {
		System.out.println("Desligar o veiculo...");
	}
	
	public void acelerar() {
		System.out.println("Veiculo esta a acelerar");
	}
	
	public void travar() {
		System.out.println("O veiculo acabou de travar");
	}
	
	public void retaguardar() {
		System.out.println("O veiculo esta a dar retaguarda");
	}

	public String getTipoVeiculo() {
		return tipoVeiculo;
	}

	public void setTipoVeiculo(String tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}

	public String getModeloVeiculo() {
		return modeloVeiculo;
	}

	public void setModeloVeiculo(String modeloVeiculo) {
		this.modeloVeiculo = modeloVeiculo;
	}

	public int getNumeroPassageiros() {
		return numeroPassageiros;
	}

	public void setNumeroPassageiros(int numeroPassageiros) {
		this.numeroPassageiros = numeroPassageiros;
	}

	public int getNumeroRodas() {
		return numeroRodas;
	}

	public void setNumeroRodas(int numeroRodas) {
		this.numeroRodas = numeroRodas;
	}

}
