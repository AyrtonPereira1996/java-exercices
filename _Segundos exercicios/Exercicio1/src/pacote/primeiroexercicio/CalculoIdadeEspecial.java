package pacote.primeiroexercicio;

import java.util.Scanner;

public class CalculoIdadeEspecial {
	/*Variaveis de objecto*/
	Scanner input = new Scanner(System.in);
	int idade, anos, meses, dias;
	
	
	public void CalculoIdadeEspecial() {
		System.out.println("Por favor expresse a sua idade em anos, meses e dias:");
		System.out.print("Anos = " );
		anos = input.nextInt();
		
		System.out.print("Meses = ");
		meses =input.nextInt();
		
		System.out.print("Dias = ");
		dias = input.nextInt();
		
		int auxiMes = meses * 30;

		int auxiAno = anos * 365;

		idade = auxiAno + (auxiMes + dias);
		
		System.out.println("A sua idade em dias é : " + idade);
		System.out.println(anos + " anos; " + meses + " meses; " + dias + " dias = " + idade);
		
	}
	
	
	public static void main(String[] args) {
		CalculoIdadeEspecial calculoIdade = new CalculoIdadeEspecial();
		calculoIdade.CalculoIdadeEspecial();

	}

}
