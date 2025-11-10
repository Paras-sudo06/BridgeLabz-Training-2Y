public class Problem_04 {
    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }

    public static double convertMilesToKm(double miles) {
        return miles * 1.60934;
    }

    public static double convertMetersToFeet(double meters) {
        return meters * 3.28084;
    }

    public static double convertFeetToMeters(double feet) {
        return feet * 0.3048;
    }

    public static void main(String[] args) {
        System.out.println("10 Km = " + convertKmToMiles(10) + " miles");
        System.out.println("5 Miles = " + convertMilesToKm(5) + " km");
        System.out.println("20 Meters = " + convertMetersToFeet(20) + " feet");
        System.out.println("50 Feet = " + convertFeetToMeters(50) + " meters");
    }

}
