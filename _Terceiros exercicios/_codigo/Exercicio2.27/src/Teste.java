
public class Teste {

	public static void main(String[] args) {
		AutomovelUsado usado = new AutomovelUsado();
		usado.setWasSold(false);
		usado.comprarCarro();
		usado.isAvailable(usado.isWasSold());
	}

}
