import java.time.LocalDate; // Este paquete contiene LocalDate, LocalTime y LocalDateTime.
import java.time.temporal.ChronoUnit;

//Popup message
import javax.swing.JOptionPane;

public class App {

    //GROSO CHATGPT
    public static long calcularDistanciaEnDias(LocalDate fecha1, LocalDate fecha2) {
        // Utilizar el método ChronoUnit.between() para calcular la diferencia en días
        long distanciaEnDias = ChronoUnit.DAYS.between(fecha1, fecha2);
        return distanciaEnDias + 1; //el +1 es para que cuente el día 1 de enero como 1
    }

    //GROSO FACU
    public static boolean esBisiesto(int yyyy)
    {
        if ((yyyy % 4 == 0) && ((yyyy % 100 != 0) || (yyyy % 400 == 0)))
            return true;
        else
            return false;
    }

    public static void main(String[] args) throws Exception {
        //obtengo el día de hoy
        LocalDate hoy = LocalDate.now();
        //obtengo el año actual
        int anio = hoy.getYear();
        //declaro variable que almacena el 1 de enero del año actual
        LocalDate primEne = LocalDate.of(anio,01,01);
        //con esta función, obtengo el tiempo entre dos fechas
        long duration = calcularDistanciaEnDias(primEne, hoy);
        //System.out.println(duration);
        String msg;
        if(esBisiesto(anio)==false)
        {
            msg = "Página "+ duration +" de 365";
        }
        else
        {
            msg = "Página "+ duration +" de 366";
        }
        //mensaje para el usuario
        JOptionPane.showMessageDialog(null,
                msg,
                "Página del día - Facundo Mayordomo",
                JOptionPane.INFORMATION_MESSAGE);
    }
}

