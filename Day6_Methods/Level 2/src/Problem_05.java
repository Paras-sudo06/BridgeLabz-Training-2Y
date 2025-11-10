public class Problem_05 {
     // Yards <-> Feet
    public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }

    public static double convertFeetToYards(double feet) {
        return feet * 0.333333;
    }

    // Meters <-> Inches
    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }

    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;
    }

    // Inches -> Centimeters
    public static double convertInchesToCm(double inches) {
        return inches * 2.54;
    }

    // Fahrenheit <-> Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    // Pounds <-> Kilograms
    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    // Gallons <-> Liters
    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    // Main method to test
    public static void main(String[] args) {
        System.out.println("5 yards = " + convertYardsToFeet(5) + " feet");
        System.out.println("15 feet = " + convertFeetToYards(15) + " yards");
        System.out.println("2 meters = " + convertMetersToInches(2) + " inches");
        System.out.println("20 inches = " + convertInchesToMeters(20) + " meters");
        System.out.println("10 inches = " + convertInchesToCm(10) + " cm");
        System.out.println("100 F = " + convertFahrenheitToCelsius(100) + " C");
        System.out.println("37 C = " + convertCelsiusToFahrenheit(37) + " F");
        System.out.println("50 pounds = " + convertPoundsToKilograms(50) + " kg");
        System.out.println("22 kg = " + convertKilogramsToPounds(22) + " pounds");
        System.out.println("10 gallons = " + convertGallonsToLiters(10) + " liters");
        System.out.println("25 liters = " + convertLitersToGallons(25) + " gallons");
    }
}
