import java.util.*;

public class FuelConsumption {                                 /* A computation class of the fuel consumption from miles per gallon to litres per 100 km */ 

    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);

        int m=scanner.nextInt();    

        double litres, lp100km, kml;

        double valuekilom=m*1.6;

        if(m>=1 && m<=100){

            kml=valuekilom/4.54;

            lp100km=100/kml;

            System.out.printf("%d litres per 100 km", (int)lp100km);

        }

        else{

            System.out.println("Value of number m has to be from 1 to 100.");

            return;

        }

    }
}

