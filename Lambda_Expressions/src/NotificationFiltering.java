import java.util.*;
import java.util.function.Predicate;

class Alert {
    String type;
    String message;

    Alert(String type, String message) {
        this.type = type;
        this.message = message;
    }

    @Override
    public String toString() {
        return "[" + type + "] " + message;
    }
}

public class NotificationFiltering {
    public static void main(String[] args) {

        List<Alert> alerts = Arrays.asList(
                new Alert("Critical", "Heart rate abnormal"),
                new Alert("Normal", "Routine check completed"),
                new Alert("High", "Blood pressure elevated"),
                new Alert("Low", "Temperature slightly low")
        );

        Predicate<Alert> criticalFilter = a -> a.type.equals("Critical") || a.type.equals("High");

        System.out.println("Showing Important Alerts:");
        alerts.stream()
                .filter(criticalFilter)
                .forEach(System.out::println);
    }
}