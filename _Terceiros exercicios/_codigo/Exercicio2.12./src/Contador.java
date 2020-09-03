
//CLASSE DO EXERCICIO 2.29.
public class Contador {
	private int cont = 0;

// METODO PARA CONTAR O NUMERO DE VEZES QUE A INSTACIA DE LAMPADA E ACESA
	
	public int contAcender(Lampada lampada) {
		this.cont = lampada.numeroVezes;
		this.cont++;
		return this.cont;
	}
	
//	GETTERS AND SETTERS
		
	public int getCont() {
		return cont;
	}
	
	public void setCont(int cont) {
		this.cont = cont;
	}

	
}
