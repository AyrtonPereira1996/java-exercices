package pacote.quintoexercicio;



public class ComparaNumero {

	void comparaNumero(int x, int y) {		
		
		if (x != y) {
			System.out.println("O valor de x é diferente de y");
			if (x > y) {
				System.out.println("Maior = " + x + "; Menor = " + y);
				System.out.println("x = " + x + "; y = " + y);
			} else if(x < y) {
				System.out.println("Maior = " + y + "; Menor = " + x);
				System.out.println("x = " + x + "; y = " + y);
			}
		} else if (x == y) {
			System.out.println("O valor de x é igual a y");
			System.out.println("x = " + x + "; y = " + y);
		}
		
	}
	
	public static void main(String[] args) {
		ComparaNumero comNumero = new ComparaNumero();
		comNumero.comparaNumero(50, 70);

	}

}
