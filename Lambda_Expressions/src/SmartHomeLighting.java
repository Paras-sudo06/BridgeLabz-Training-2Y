interface LightAction {
    void execute();
}

public class SmartHomeLighting {
    public static void main(String[] args) {

        LightAction motionTrigger = () -> System.out.println("Lights ON with soft white glow.");
        LightAction nightTrigger = () -> System.out.println("Night mode activated with dim warm lights.");
        LightAction voiceTrigger = () -> System.out.println("Color changing lights activated!");

        System.out.println("Motion detected...");
        motionTrigger.execute();

        System.out.println("Time is 9 PM...");
        nightTrigger.execute();

        System.out.println("Voice Command: 'Party Mode'...");
        voiceTrigger.execute();
    }
}