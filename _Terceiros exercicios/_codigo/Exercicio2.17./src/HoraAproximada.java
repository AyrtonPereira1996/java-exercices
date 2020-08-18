import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

//CLASSE DO EXERCICIO 2.20
public class HoraAproximada {

	public static void main(String[] args) {
		LocalTime horaActual = LocalTime.now();
		
		DateTimeFormatter formater = DateTimeFormatter.ISO_TIME;
		LocalTime horaAproximada = horaActual.minusMinutes(10);
		System.out.println(horaAproximada);

	}

}
