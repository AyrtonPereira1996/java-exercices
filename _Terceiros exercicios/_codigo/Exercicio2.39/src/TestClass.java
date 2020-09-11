
public class TestClass {

	public static void main(String[] args) {
		ContaBancariaSimplificada conta = new ContaBancariaSimplificada("Ayrton Pereira", "Normal", 500.0f);
		conta.retira(500);
		conta.retira(3);

	}

}
