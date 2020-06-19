package pacote.quartoexercicio;

public class Peca {
	
	private int quantidade;
	private String codigo;
	private float valor;
	
	Peca(String codigo, int quantidade, float valor){
		this.quantidade = quantidade;
		this.codigo = codigo;
		this.valor = valor;
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	
	

}
