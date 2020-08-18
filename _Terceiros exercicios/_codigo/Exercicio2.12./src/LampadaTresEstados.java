
//CLASSE DO EXERCICIO 2.18.
public class LampadaTresEstados extends Lampada {
	private String estado = "Apagada";
	
	
	public void saberEstado() {
		System.out.println("Estado da lampada: " + this.estado);
	}
	
	public void mudaEstado(String estadoNovo) {
		if(getEstado().equals(estadoNovo)) {
			System.out.println("A lampada esta no estado que deseja mudar");
			System.err.println("Nao foi possivel alterar o estado da lampada");
		} else {
			if (estadoNovo.equalsIgnoreCase("ligada")) {
				setEstado(estadoNovo);
			} else if (estadoNovo.equalsIgnoreCase("meia luz")) {
				setEstado(estadoNovo);
			} else {
				System.out.println("Resposta invalida");
			}
		}
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}
	

	
	
	

}
