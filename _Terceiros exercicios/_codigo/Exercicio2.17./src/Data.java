import java.time.LocalDate;

//CLASSE DO EXERCICIO 2.17
public class Data {
	private int dia; 
	private int mes;
	private int ano;
	private LocalDate date = LocalDate.now();

	
//METODO QUE RETORNA UMA DATA EM FORMATO NORMAL (DIA/MES/ANO) EM STRING
	public String retornaData(int dia, int mes,int ano) {
		StringBuilder data = new StringBuilder();
		data.append(dia + "/" + mes + "/" + ano);
		String dataRetornada = data.toString();
		return dataRetornada;		
	}

//TRANSFORMA A DATA SETADA NO PARAMETRO, TESTA E MOSTRA A DATA CASO TENHA PASSADO NO TESTE 
	public void mostraData(int dia, int mes, int ano) {
		String dataRetorno = retornaData(dia, mes, ano);
		if(dataRetorno.equals("0/0/0")) {
			System.out.println("Data Inválida");
		}else {
			System.out.println("Data: " + dataRetorno);
		}
	}

	
// FUNCAO VEM ANTES EXERCICIO 2.48.
	public boolean vemAntes() {
		boolean isDataEncapsuladaAntes = false;
		this.ano = 2020;
		this.dia = 30;
		this.mes = 9;
		int diaActual = date.getDayOfMonth();
		int mesActual = date.getMonthValue();
		int anoActual = date.getYear();
		
		if(anoActual > ano) {
			isDataEncapsuladaAntes = true;
		} else if (anoActual < ano) {
			isDataEncapsuladaAntes = false;
		} else if (anoActual == ano && mesActual > mes) {
			isDataEncapsuladaAntes = true;
		} else if (anoActual == ano && mesActual < mes) {
			isDataEncapsuladaAntes = false;
		} else if (anoActual == ano && mesActual == mes && diaActual > dia) {
			isDataEncapsuladaAntes = true;
		} else if (anoActual == ano && mesActual == mes && diaActual < dia) {
			isDataEncapsuladaAntes = false;
		} else {
			isDataEncapsuladaAntes = true;
			System.out.println("As datas são iguais");
		}
		
		return isDataEncapsuladaAntes;
	}
	
//	METODOS GETTERS AND SETTERS

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	
	
}
