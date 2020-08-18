
//	CLASSE DO EXERCICIO 2.11
public class Lampada {

//	ATRIBUTOS DA CLASSE LAMPADA
	private String marcaLampada;
	private String tipoLampada;
	private int capacidadeLampada;
	private String corLuz;
	private double precoLampada;
	private boolean estadoLampada = false;

//	METODOS GETTERS AND SETTERS
	public boolean isEstadoLampada() {
		return estadoLampada;
	}

	public void setEstadoLampada(boolean estadoLampada) {
		this.estadoLampada = estadoLampada;
	}

//	METODO AVALIA SE ESTA LIGADA OU DESLIGADA
	public boolean estaLigada() {
		if (estadoLampada==true) {
			System.out.println("Lampada ligada");
			return true;
		} else
			System.out.println("Lampada desligada");
			return false;
	}

}
