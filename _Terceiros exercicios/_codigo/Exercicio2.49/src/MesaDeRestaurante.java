//CLASSE DO EXERCICIO 2.49
public class MesaDeRestaurante {
	private int quantidadePedido = 0;
	
//	METODO PARA INCREMENTAR PEDIDO 
	public void adicionaAoPedido() {
		this.quantidadePedido++;
	}
	
//	METODO PARA ZERAR PEDIDOS
	public void zerarPedidos() {
		this.quantidadePedido = 0;
	}
	
//  METODO PARA CALCULAR O TOTAL
	public int calcularTotal() {
		int totalPedidos = this.quantidadePedido;
		int totalPagar = (50 * totalPedidos);
		return totalPagar;
	}
	
}
