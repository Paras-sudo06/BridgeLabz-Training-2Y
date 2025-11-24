interface SensitiveData {}   // Marker Interface

class Aadhaar implements SensitiveData {
    String number = "1234-5678-9000";
}

public class SecurityCheck {
    public static void main(String[] args) {
        Aadhaar a = new Aadhaar();

        if (a instanceof SensitiveData)
            System.out.println("Encrypt before storing!");
    }
}
