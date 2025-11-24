interface BackupSerializable {}   // Marker

class UserData implements BackupSerializable {
    String name;
    UserData(String name) { this.name = name; }
}

public class BackupTest {
    public static void main(String[] args) {
        UserData u = new UserData("Paras");
        if (u instanceof BackupSerializable)
            System.out.println("Object allowed for backup.");
    }
}
