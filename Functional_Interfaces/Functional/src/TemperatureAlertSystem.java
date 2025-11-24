import java.util.function.Predicate;

public class TemperatureAlertSystem {
    public static void main(String[] args) {
        double threshold = 40.0;

        Predicate<Double> isHighTemperature = temp -> temp > threshold;

        double currentTemp1 = 35.5;
        double currentTemp2 = 42.3;

        checkTemperature(currentTemp1, isHighTemperature);
        checkTemperature(currentTemp2, isHighTemperature);
    }

    static void checkTemperature(double temp, Predicate<Double> condition) {
        if (condition.test(temp)) {
            System.out.println("ALERT! Temperature is too high: " + temp + "°C");
        } else {
            System.out.println("Temperature is normal: " + temp + "°C");
        }
    }
}
