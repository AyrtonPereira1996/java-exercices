import java.time.LocalDate;

//CLASSE DO EXERCICIO 2.39
public class ContaBancariaSimplificada {

//ATRIBUTOS DA CLASSE	
	private String titularConta;
	private String tipoConta;
	private double montanteMonetario;
	private LocalDate dataAbertura;
	private boolean contaAberta = false;
	
//METODO CONTRUSTOR
public ContaBancariaSimplificada(String titular, String tipoConta, double montanteMonetario) {
	this.abrirConta(titular, tipoConta, montanteMonetario, dataAbertura);
}

//METODO QUE IRA PERMITIR ABRIR CONTA
	private void abrirConta(String titular, String tipoConta, double montanteMonetario, LocalDate dataAbertura) {
		if(montanteMonetario < 0) {
			System.err.println("Não é possivel abrir conta com montante negativo");
			contaAberta = false;
			
		} else if(montanteMonetario > 0) {
		setTitularConta(titular);
		setTipoConta(tipoConta);
		setMontanteMonetario(montanteMonetario);
		setDataAbertura(LocalDate.now());
		contaAberta = true;
		System.out.println("Conta bancaria aberta com sucesso!");}
	}
	
//MOSTRAR DADOS DE TITULAR
	public void mostrarDados() {
		if (this.contaAberta == false) {
			System.err.println("A conta nao está criada, por favor crie uma!");
		} else if (this.contaAberta == true) {
			System.out.println("Titular da conta -> " + this.getTitularConta() + "\nTipo de conta -> " + this.getTipoConta() + "\nValor monetario -> " + this.getMontanteMonetario() + "\nData abertura -> " + this.getDataAbertura());
		}
		
	}

//METODO PARA DEPOSITAR
	public void deposita(double montanteDepositar) {
		if (this.contaAberta == false) {
			System.err.println("A conta nao está criada, por favor crie uma!");
		} else if (this.getMontanteMonetario() < 0 || this.contaAberta == true) {
			System.out.println("A sua conta esta com saldo negativo");
			this.setMontanteMonetario(this.getMontanteMonetario() + montanteMonetario);
			System.out.println("Valor actual corresponde a " + this.getMontanteMonetario());
		} else {
			this.setMontanteMonetario(this.getMontanteMonetario() + montanteMonetario);
			System.out.println("Valor actual corresponde a " + this.getMontanteMonetario());
		}
		
	}
	
//METODO PARA RETIRAR
	public void retira(double montanteRetirar) {
		if (this.getMontanteMonetario() < 0) {
			System.err.println("Não é possivel retirar montante da sua conta porque seu saldo é negativo.");
		} else if (this.getMontanteMonetario() == 0) {
			System.err.println("Não é possivel retirar montante da sua conta porque seu saldo é igual a zero.");
		} else if (montanteRetirar > this.getMontanteMonetario()) {
			System.out.println("Ao realizar esta operecao ira ficar com saldo negativo");
		} else {
		this.setMontanteMonetario(getMontanteMonetario() - montanteRetirar);
		System.out.println("Valor actual corresponde a " + this.getMontanteMonetario());
		}	
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
