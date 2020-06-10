/*Nome: Ayrton Kassandro Ferreira Satar & Pereira
 *Exercicio 1
 * 
 * 
 */

package pacote.primeiroexercicio;

public class MaiorNumero {
	/*Variaveis de objecto*/
	int numero1;
	int numero2;
	
	/*Metodo constructor da classe*/
	public MaiorNumero(int num1, int num2) {
		this.numero1 = num1;
		this.numero2 = num2;
		
		System.out.println(numeroComparar());
	}
	
	/*Metodo para comparar os dois valores de entrada */
	String numeroComparar() {
		System.out.print("O primeiro número corresponde a " + this.numero1 + "\n");
		System.out.print("O segundo número corresponde a " + this.numero2 + "\n");
		
		int maiorNumero = (this.numero1 > this.numero2) ? this.numero1:this.numero2;
		String resultado = "Maior número " + maiorNumero;
		
		return resultado;
	
	}
	
	/*Metodo principal*/
	public static void main (String[] args) {
		
		@SuppressWarnings("unused")
		MaiorNumero numero = new MaiorNumero(30, 40);
	}

}
