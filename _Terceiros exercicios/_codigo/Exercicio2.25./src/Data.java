
//CLASSE DO EXERCICIO 2.25.(
public class Data {
	private boolean isDataInvalida = false;
	private String data = "";
	
	
	
	public boolean isInvalida(String data) {
		this.data = data;
		if (data.equalsIgnoreCase("Valida")) {
			isDataInvalida = false;
		} else if (data.equalsIgnoreCase("Invalida")) {
			isDataInvalida = true;
		}
		return isDataInvalida;
	}
	
	public void isEquals() {
		if(isInvalida(this.data) == true) {
			System.out.println("Data diferente da data valida");
		} else if (isInvalida(this.data) == false){
			System.out.println("Data Valida");
		}
	}

	public boolean isDataInvalida() {
		return isDataInvalida;
	}

	public void setDataInvalida(boolean isDataInvalida) {
		this.isDataInvalida = isDataInvalida;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	
}
