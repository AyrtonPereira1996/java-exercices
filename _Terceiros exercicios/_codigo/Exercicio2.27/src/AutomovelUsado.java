
//CLASSE DO EXERCICIO 2.27.
public class AutomovelUsado {
//	Atributos do automovel
	private int anoFabrico;
	private String modelo;
	private int quilometragem;
	private String tipoCombustivel;
	private double preco;
	private boolean wasSold = false; // atributo que mostra a disponibiblidade do automovel 
	
//	metodo que verifica se o carro foi vendido ou nao
	public void isAvailable(boolean wasSold) {
		if(wasSold == true) {
			System.out.println("O carro foi vendido");
		}else if (wasSold == false) {
			System.out.println("O carro nao foi vendido");
		}
	}
	
//	metodo que permitir realizar a acao de comprar carro
	public void comprarCarro() {
		if(this.wasSold == true) {
			System.out.println("O carro foi vendido");
		}else {
			System.out.println("O carro pode ser vendido");
		}
	}
	
	
//	metodos getters e setters
	public boolean isWasSold() {
		return wasSold;
	}

	public void setWasSold(boolean wasSold) {
		this.wasSold = wasSold;
	}
	
	public int getAnoFabrico() {
		return anoFabrico;
	}
	
	public void setAnoFabrico(int anoFabrico) {
		this.anoFabrico = anoFabrico;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public int getQuilometragem() {
		return quilometragem;
	}
	
	public void setQuilometragem(int quilometragem) {
		this.quilometragem = quilometragem;
	}
	
	public String getTipoCombustivel() {
		return tipoCombustivel;
	}
	
	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}

}
