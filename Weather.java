import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean invalidEntry = true;

        while (invalidEntry)  {
            System.out.println("1 - Farenheit to Celsius");
            System.out.println("2 - Celsius to Farenheit");
            int userInput = scan.nextInt();

            if ( userInput == 1) {
                invalidEntry = false;
                System.out.println("Farenheit Temp: ");
                double farenheit = scan.nextDouble();
                System.out.println("\n" + farenheit + " Farenheit is " + (celsiusConverter(farenheit)) + "Celsius.");
            }

            if ( userInput == 2) {
                invalidEntry = false;
                System.out.println("Celsius Temp: ");
                double celsius = scan.nextDouble();
                System.out.println("\n" + celsius + " Celsius is " + (farenheitConverter(celsius)) + "Farenheit.");
            }

        }

        scan.close();
        }
    
    public static double celsiusConverter (double farenheitTemp) {
        double celsius = (farenheitTemp - 32) * 5 / 9;
        celsius = Math.round(celsius * 100.0) / 100.0;
        return celsius;
    }

    public static double farenheitConverter (double celsiusTemp) {
        double fahrenheit = (celsiusTemp * 9 / 5) + 32;
        fahrenheit = Math.round(fahrenheit * 100.0) / 100.0;
        return fahrenheit;
    }
}
