//ZONA DE IMPORTS XD
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TestApp {
    public static void main(String[] args) throws Exception {
        //Así se obtiene el día en formato ZonedDateTime XD
        ZonedDateTime day = ZonedDateTime.now(ZoneId.of("America/Argentina/Buenos_Aires"));
        //impresión del dato en ZonedDateTime
        System.out.println(day);
        //así se le da formato de String
        String dayString = day.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        //Se imprime el día en formato de String
        System.out.println(dayString);

        //obtengo el día y el mes, en base al dato ZonedDateTime
        int Dia = day.getDayOfMonth();
        System.out.println("El día es " + Dia);
        int Mes = day.getMonthValue();
        System.out.println("El mes es " + Mes);

    }
    
}
