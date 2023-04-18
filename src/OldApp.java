//ZONA DE IMPORTS
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class App {

    //función que determina si un año es bisiesto o no
    public static boolean esBisiesto(int yyyy)
    {
        if ((yyyy % 4 == 0) && ((yyyy % 100 != 0) || (yyyy % 400 == 0)))
            return true;
        else
            return false;
    }

    // función que dada una fecha del tipo ZonedDateTime, devuelve un número entre 1 y 365 o 366
    public static int diaDelMes(ZonedDateTime currentDay)
    {
        int day = currentDay.getDayOfMonth();
        int month = currentDay.getMonthValue();
        int year = currentDay.getYear();
        int number = 0;
        //booleano que comprueba si el año es bisiesto
        boolean leapYear = esBisiesto(year);
        switch(month)
        {
            case 1:
                number = day;
                break;
            case 2:
                number = 31 + day;
                break;
            case 3:
                if(leapYear == false)
                {
                    number = 59 + day;
                }
                else
                {
                    number = 60 + day; 
                }
                break;
            case 4:
                if(leapYear == false)
                {
                    number = 90 + day;
                }
                else
                {
                    number = 91 + day; 
                }
                break;
            case 5:
                if(leapYear == false)
                {
                    number = 120 + day;
                }
                else
                {
                    number = 121 + day; 
                }
                break;
            case 6:
                if(leapYear == false)
                {
                    number = 151 + day;
                }
                else
                {
                    number = 152 + day; 
                }
                break;
            case 7:
                if(leapYear == false)
                {
                    number = 181 + day;
                }
                else
                {
                    number = 182 + day; 
                }
                break;
            case 8:
                if(leapYear == false)
                {
                    number = 212 + day;
                }
                else
                {
                    number = 213 + day; 
                }
                break;
            case 9:
                if(leapYear == false)
                {
                    number = 243 + day;
                }
                else
                {
                    number = 244 + day; 
                }
                break;
            case 10:
                if(leapYear == false)
                {
                    number = 273 + day;
                }
                else
                {
                    number = 274 + day; 
                }
                break;
            case 11:
                if(leapYear == false)
                {
                    number = 304 + day;
                }
                else
                {
                    number = 305 + day; 
                }
                break;
            case 12:
                if(leapYear == false)
                {
                    number = 334 + day;
                }
                else
                {
                    number = 335 + day; 
                }
                break;                                          
        }
        return number;
    }

    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        ZonedDateTime day = ZonedDateTime.now(ZoneId.of("America/Argentina/Buenos_Aires"));
        int NumeroDia = diaDelMes(day);
        int yy = day.getYear();
        int lastPart;
        if(esBisiesto(yy) == true)
        {
            lastPart = 366;
        }
        else
        {
            lastPart = 365;
        }
        System.out.println("Página " + NumeroDia + " de " + lastPart);
        //System.out.println(day);
    }
}
