//CLASSE DO EXERCICIO 2.49
public class RestauranteCaseiro {
	private MesaDeRestaurante mesa1;
	private MesaDeRestaurante mesa2;
	private MesaDeRestaurante mesa3;
	private MesaDeRestaurante mesa4;
	private MesaDeRestaurante mesa5;

//	METODO PARA ADICIONAR PEDIDO
	public void adicionaAoPedido(MesaDeRestaurante mesa) {
		mesa.adicionaAoPedido();
	}
	
	
	
	
//	METODOS GETTERS AND SETTERS
	public MesaDeRestaurante getMesa1() {
		return mesa1;
	}
	public void setMesa1(MesaDeRestaurante mesa1) {
		this.mesa1 = mesa1;
	}
	public MesaDeRestaurante getMesa2() {
		return mesa2;
	}
	public void setMesa2(MesaDeRestaurante mesa2) {
		this.mesa2 = mesa2;
	}
	public MesaDeRestaurante getMesa3() {
		return mesa3;
	}
	public void setMesa3(MesaDeRestaurante mesa3) {
		this.mesa3 = mesa3;
	}
	public MesaDeRestaurante getMesa4() {
		return mesa4;
	}
	public void setMesa4(MesaDeRestaurante mesa4) {
		this.mesa4 = mesa4;
	}
	public MesaDeRestaurante getMesa5() {
		return mesa5;
	}
	public void setMesa5(MesaDeRestaurante mesa5) {
		this.mesa5 = mesa5;
	}

}
