
//CLASSE DO EXERCICIO 2.24.
public class LivroBiblioteca extends Livro {
	private long numeroPedidos;
	private long numeroDevolucoes;

	public long getNumeroPedidos() {
		return numeroPedidos;
	}
	
	public void setNumeroPedidos(long numeroPedidos) {
		this.numeroPedidos = numeroPedidos;
	}
	
	public long getNumeroDevolucoes() {
		return numeroDevolucoes;
	}
	
	public void setNumeroDevolucoes(long numeroDevolucoes) {
		this.numeroDevolucoes = numeroDevolucoes;
	}
}
