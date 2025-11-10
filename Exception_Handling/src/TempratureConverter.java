import java.util.*;

// Custom Exception for invalid temperature
class InvalidTemperatureException extends Exception {
    public InvalidTemperatureException(String message) {
        super(message);
    }
}

class TemperatureConverter {

    // Convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) throws InvalidTemperatureException {
        if (celsius < -273.15) {
            throw new InvalidTemperatureException("Temperature below absolute zero is not possible!");
        }
        return (celsius * 9 / 5) + 32;
    }

    // Convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) throws InvalidTemperatureException {
        if (fahrenheit < -459.67) {
            throw new InvalidTemperatureException("Temperature below absolute zero is not possible!");
        }
        return (fahrenheit - 32) * 5 / 9;
    }
}

public class TempratureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter temperature value: ");
            double temp = sc.nextDouble();

            System.out.print("Enter unit (C/F): ");
            char unit = sc.next().toUpperCase().charAt(0);

            if (unit == 'C') {
                double fahrenheit = TemperatureConverter.celsiusToFahrenheit(temp);
                System.out.printf("%.2f°C = %.2f°F\n", temp, fahrenheit);
            } else if (unit == 'F') {
                double celsius = TemperatureConverter.fahrenheitToCelsius(temp);
                System.out.printf("%.2f°F = %.2f°C\n", temp, celsius);
            } else {
                System.out.println("Invalid unit! Please enter 'C' or 'F'.");
            }

        } catch (InvalidTemperatureException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.err.println("Error: Please enter a valid numeric temperature.");
        }

        sc.close();
    }
}
