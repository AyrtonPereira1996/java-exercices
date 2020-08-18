import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class MainDataClasse {

	public static void main(String[] args) {
//		CRIACAO DA VARIAVEL QUE IRA ARMAZENAR A DATA ACTUAL
		LocalDate dateToday = LocalDate.now();

//		METODO QUE TRANSFORMA A DATA MOSTRANDO O MES 
		String transformedDate = dateToday.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
		System.out.println("Data sem transformação : " + dateToday);
		System.out.println("Data com transformação : " + transformedDate);

	}

}
