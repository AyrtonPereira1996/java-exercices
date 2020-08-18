
//CLASSE DO EXERCICIO 2.17
public class Data {
	
	private int dia;
	private int mes;
	private int ano;
	
//METODO QUE RETORNA UMA DATA EM FORMATO NORMAL (DIA/MES/ANO) EM STRING
	private String retornaData(int dia, int mes,int ano) {
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

}
