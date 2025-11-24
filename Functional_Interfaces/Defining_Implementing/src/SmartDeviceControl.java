public class SmartDeviceControl {
    public static void main(String[] args) {
        SmartDevice light = new Light();
        SmartDevice ac = new AC();
        SmartDevice tv = new TV();

        light.turnOn();
        ac.turnOn();
        tv.turnOn();

        light.turnOff();
        ac.turnOff();
        tv.turnOff();
    }
}
interface  SmartDevice{
    void turnOff();
    void turnOn();
}

class Light implements SmartDevice{
    public void turnOn(){
        System.out.println("Light is turned On.");
    }
    public void turnOff(){
        System.out.println("Light is turned Off");
    }
}

class TV implements SmartDevice{
    public void turnOn(){
        System.out.println("TV is turned On.");
    }
    public void turnOff(){
        System.out.println("Tv is turned Off");
    }
}
class AC implements SmartDevice{
    public void turnOn() {
        System.out.println("AC is turned ON.");
    }
    public void turnOff() {
        System.out.println("AC is turned OFF.");
    }
}