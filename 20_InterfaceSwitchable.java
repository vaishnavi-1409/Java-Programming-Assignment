interface Switchable {
    void turnOn();
    void turnOff();
}

class Light implements Switchable {
    public void turnOn() { System.out.println("Light is ON."); }
    public void turnOff() { System.out.println("Light is OFF."); }
}

class AC implements Switchable {
    public void turnOn() { System.out.println("AC is cooling."); }
    public void turnOff() { System.out.println("AC is stopped."); }
}

class Fan implements Switchable {
    public void turnOn() { System.out.println("Fan is rotating."); }
    public void turnOff() { System.out.println("Fan is stopped."); }
}

// Added class: the loop in main does not need to change.
class Television implements Switchable {
    public void turnOn() { System.out.println("Television is ON."); }
    public void turnOff() { System.out.println("Television is OFF."); }
}

public class InterfaceSwitchable {
    public static void main(String[] args) {
        Switchable[] devices = {
            new Light(), new AC(), new Fan(), new Television()
        };

        for (int i = 0; i < devices.length; i++) {
            devices[i].turnOn();
            devices[i].turnOff();
            System.out.println();
        }
    }
}
