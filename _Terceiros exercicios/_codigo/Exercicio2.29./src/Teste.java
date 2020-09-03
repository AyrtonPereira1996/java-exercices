
public class Teste {

	public static void main(String[] args) {
		Contador itemsMesa = new Contador("Mesas");
		itemsMesa.printNumberOfThings(itemsMesa);
		itemsMesa.addItem(3);
		itemsMesa.printNumberOfThings(itemsMesa);
		itemsMesa.removeItem(2);
		itemsMesa.printNumberOfThings(itemsMesa);
		itemsMesa.resetContador();
	}

}
