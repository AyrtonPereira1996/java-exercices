
//	CLASSE DO EXERCICIO 2.12.
public class Lampada {

//	ATRIBUTOS DA CLASSE LAMPADA
	protected String marcaLampada;
	protected String tipoLampada;
	protected int capacidadeLampada;
	protected String corLuz;
	protected double precoLampada;
	protected boolean estadoLampada = false;
	protected int watts;

//	METODOS GETTERS AND SETTERS
	public boolean isEstadoLampada() {
		return estadoLampada;
	}

	public void setEstadoLampada(boolean estadoLampada) {
		this.estadoLampada = estadoLampada;
	}

	public int getWatts() {
		return watts;
	}

	public void setWatts(int watts) {
		this.watts = watts;
	}

	// METODO AVALIA SE ESTA LIGADA OU DESLIGADA
	public boolean estaLigada() {
		if (estadoLampada == true) {
			System.out.println("Lampada ligada");
			return true;
		} else {
			System.out.println("Lampada desligada");
			return false;
		}
	}

	public boolean isEconomic() {
		if (watts < 40) {
			System.out.println("Lampada economica");
			return true;
		} else {
			System.out.println("Lampada nao economica");
			return false;
		}
	}

}
