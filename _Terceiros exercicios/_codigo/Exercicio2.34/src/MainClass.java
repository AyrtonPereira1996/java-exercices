
public class MainClass {

	public static void main(String[] args) {
		Empregado emp = new Empregado("Ernesto", "directoria", 200, 50);
		double salario = emp.calculaSalarioMensal(emp.getHorasTrabalhoPorMes(), emp.getSalarioPorHora());
		System.out.println("O salario corresponde a " + salario);

	}

}
