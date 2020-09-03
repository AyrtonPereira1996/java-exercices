
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
	protected Contador contagem = new Contador();
	protected int numeroVezes = 0;
	
	
//	METODO PARA ACENDER LAMPADA
	public void acenderLampada() {
		if(estaLigada()) {
			System.out.println("A lampada nao pode ser acesa porque esta ligada");
		} else {
			System.out.println("Lampada a trocar de estado...");
			estadoLampada = true;
			System.out.println("Lampada acesa!");
			this.numeroVezes = contagem.contAcender(this);
			System.out.println("Foi acesa " + this.numeroVezes + " vezes");
		}
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

// METODO QUE PERMITE VERIFICAR SE A LAMPADA É ECONOMICA OU NÃO
	public boolean isEconomic() {
		if (watts < 40) {
			System.out.println("Lampada economica");
			return true;
		} else {
			System.out.println("Lampada nao economica");
			return false;
		}
	}

	
		
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
	
	public int getNumeroVezes() {
		return numeroVezes;
	}
	
	public void setNumeroVezes(int numeroVezes) {
		this.numeroVezes = numeroVezes;
	}
	

}
