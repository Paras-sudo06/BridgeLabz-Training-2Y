public class Sensordataloger {
    public static void main(String[] args) {
        double sensorTemp = 36.8;             // primitive double
        Double cachedTemp = sensorTemp;       // auto-boxing (double → Double)

        processPrimitive(sensorTemp);
        processWrapper(cachedTemp);
        processWrapper(null);

        // auto-unboxing (Double → double)
        double avgTemp = (sensorTemp + cachedTemp) / 2;
        System.out.println("Average temperature: " + avgTemp + " °C");
    }

    public static void processPrimitive(double temp) {
        System.out.println("Processing primitive temperature: " + temp);
    }

    public static void processWrapper(Double temp) {
        if (temp == null) {
            System.out.println("Temperature data missing (null).");
        } else {
            System.out.println("Processing wrapper temperature: " + temp);
        }
    }
}
