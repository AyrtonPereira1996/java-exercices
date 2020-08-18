import java.time.LocalTime;

public class HoraPrecisa extends Data{
	private LocalTime horaActual= LocalTime.now();
	private int hora = horaActual.getHour();
	private int minutos = horaActual.getMinute();
	int segundos = horaActual.getSecond();
	int centesimosSegundo = horaActual.getNano();
	
	public void mostarHoraPrecisa() {
		System.out.println("Hora: " + hora + "; minutos: "+ minutos + "; segundos: " + segundos+ ", miliSegundos: "+ centesimosSegundo);
	}
	
	


}
