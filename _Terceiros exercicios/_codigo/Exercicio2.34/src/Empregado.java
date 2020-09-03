//CLASSE DO EXERCICIO 2.34
public class Empregado {

//	ATRIBUTOS DA CLASSE EMPREGADO
	private String nome;
	private String departamento;
	private int horasTrabalhoPorMes;
	private double salarioPorHora;

//	CONSTRUTOR QUE INSTACIOLIZARA COM UMA INSTACIA DE EMPREGADO ATRIBUIDO
	Empregado(String nome, String departamento, int horasTrabalhoPorMes, double salarioPorHora) {
		this.nome = nome;
		this.departamento = departamento;
		this.horasTrabalhoPorMes = horasTrabalhoPorMes;
		this.salarioPorHora = salarioPorHora;
	}

//	METODO QUE IRA EXIBIR OS DADOS DO TRABALHADOR
	public void mostrarDados() {
		System.out.println("Nome -> " + this.getNome() + ";/nDepartamento -> " + this.getDepartamento()
				+ ";/nHoras de Trabalho por mes -> " + this.getHorasTrabalhoPorMes() + " horas;/nSalario po hora -> "
				+ this.getSalarioPorHora() + "mts");
	}
	
//	METODO QUE CALCULA SALARIO MENSAL
	public double calculaSalarioMensal(int horas, double salarioPorHora) {
		double salarioMensal;
		double salarioMensalBonificado;
		
		if (this.departamento.equalsIgnoreCase("directoria")) {
			salarioMensal = horas * salarioPorHora;
			salarioMensalBonificado = (salarioMensal * 110) / 100;
			return salarioMensalBonificado;
		} else
			salarioMensal = horas * salarioPorHora;
		return salarioMensal;
	}

//	METODOS GETTERS E SETTERS
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public int getHorasTrabalhoPorMes() {
		return horasTrabalhoPorMes;
	}

	public void setHorasTrabalhoPorMes(int horasTrabalhoPorMes) {
		this.horasTrabalhoPorMes = horasTrabalhoPorMes;
	}

	public double getSalarioPorHora() {
		return salarioPorHora;
	}

	public void setSalarioPorHora(double salarioPorHora) {
		this.salarioPorHora = salarioPorHora;
	}

}
