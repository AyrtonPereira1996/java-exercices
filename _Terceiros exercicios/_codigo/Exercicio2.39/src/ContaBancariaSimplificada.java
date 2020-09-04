import java.time.LocalDate;

//CLASSE DO EXERCICIO 2.39
public class ContaBancariaSimplificada {

//ATRIBUTOS DA CLASSE	
	private String titularConta;
	private String tipoConta;
	private double montanteMonetario;
	private LocalDate dataAbertura;
	
//METODO CONTRUSTOR
public ContaBancariaSimplificada(String titular, String tipoConta, double montanteMonetario) {
	this.abrirConta(titular, tipoConta, montanteMonetario, dataAbertura);
}

//METODO QUE IRA PERMITIR ABRIR CONTA
	private void abrirConta(String titular, String tipoConta, double montanteMonetario, LocalDate dataAbertura) {
		setTitularConta(titular);
		setTipoConta(tipoConta);
		setMontanteMonetario(montanteMonetario);
		setDataAbertura(LocalDate.now());
		System.out.println("Conta bancaria aberta com sucesso!");
	}
	
//MOSTRAR DADOS DE TITULAR
	public void mostrarDados() {
		System.out.println("Titular da conta -> " + this.getTitularConta() + "\nTipo de conta -> " + this.getTipoConta() + "\nValor monetario -> " + this.getMontanteMonetario() + "\nData abertura -> " + this.getDataAbertura());
	}

//METODO PARA DEPOSITAR
	public void depositar(double montanteDepositar) {
		this.setMontanteMonetario(this.getMontanteMonetario() + montanteMonetario);
		System.out.println("Valor actual corresponde a " + this.getMontanteMonetario());
	}
	
//METODO PARA RETIRAR
	public void retirarValor(double montanteRetirar) {
		this.setMontanteMonetario(getMontanteMonetario() - montanteRetirar);
		System.out.println("Valor actual corresponde a " + this.getMontanteMonetario());
	}
	
//	METODOS GETTERS E SETTERS
	public LocalDate getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(LocalDate dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public double getMontanteMonetario() {
		return montanteMonetario;
	}

	public void setMontanteMonetario(double montanteMonetario) {
		this.montanteMonetario = montanteMonetario;
	}

	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	public String getTitularConta() {
		return titularConta;
	}

	public void setTitularConta(String titularConta) {
		this.titularConta = titularConta;
	}
}
