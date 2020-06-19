package pacote.quintoexercicio;

import java.util.Scanner;

public class CalculoSalario {
	
	void mainMetodo() {
		Scanner scanner = new Scanner(System.in); 
		float salarioMinimo;
		float salarioUsuario;
		int quantidadeSalarios;
		System.out.println("Quanto é o valor do salário minimo?");
		salarioMinimo = scanner.nextFloat();
		
		System.out.println("Quanto é o seu salário?");
		salarioUsuario = scanner.nextFloat();
		
		quantidadeSalarios = calculoQuantidadeSalarios(salarioMinimo, salarioUsuario);
		System.out.println("Com o salário de " + salarioUsuario + "MT poderá receber " + quantidadeSalarios + " salários minimos de " + salarioMinimo + "MT" );
		
	}
	
	int calculoQuantidadeSalarios(float salarioMinimo, float salarioUsuario) {
		int quantidadeSalarios;
		quantidadeSalarios = (int) (salarioUsuario/salarioMinimo);
		
		return quantidadeSalarios;
	}

	public static void main(String[] args) {
		CalculoSalario salario = new CalculoSalario();
		salario.mainMetodo();

	}

}
