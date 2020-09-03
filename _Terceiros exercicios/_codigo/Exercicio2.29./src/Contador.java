
//CLASSE DO EXERCICIO 2.29.
public class Contador {
	private int valorContador;
	private String nomeColecaoItems;

//	COntructor da classe contador
	public Contador(String nomeColecaoItems) {
		this.nomeColecaoItems = nomeColecaoItems;
	}

//METODO QUE IRA ZERAR O CONTADOR DOS ITEMS DA COLECAO	
	public void resetContador() {
		int preResetContador = this.valorContador;
		this.valorContador = 0;
		System.out.println("Valor antigo : " + preResetContador + " " + this.nomeColecaoItems + "\nValor actual: "
				+ this.valorContador + " " + this.nomeColecaoItems);
	}

//	METODO DE INCREMENTO DE ITEMS NA COLECAO
	public void addItem(int valorIncremento) {
		this.valorContador += valorIncremento;
	}

//	METODO DE DECREMENTO DE ITEMS NA COLECAO
	public void removeItem(int valorRemocao) {
		this.valorContador -= valorRemocao;
	}

// METODO PARA IMPRIMOR O VALOR DO CONTADOR
	public void printNumberOfThings(Contador colecao) {
		System.out.println("Tem " + this.valorContador + " " + this.nomeColecaoItems);
	}

// METODOS GETTERS E SETTERS
	public String getNomeItem() {
		return nomeColecaoItems;
	}

	public void setNomeItem(String nomeItem) {
		this.nomeColecaoItems = nomeItem;
	}
}
