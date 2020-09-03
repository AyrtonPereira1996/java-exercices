import java.time.LocalDate;
import java.time.LocalTime;

//CLASSE DO EXERCICIO 2.33
public class DataHora {
	LocalTime hourNow = LocalTime.now();
	LocalDate dateNow = LocalDate.now();
	
	public void horaDataAproximada() {
		LocalTime nearHour = hourNow.minusHours(1);
		LocalDate nearDate = dateNow.minusDays(1);
		System.out.println("Hora/data actual = " + hourNow + "/" + dateNow + "\nHora/data aproximada = " + nearHour + "/" + nearDate);
	}
	

}
