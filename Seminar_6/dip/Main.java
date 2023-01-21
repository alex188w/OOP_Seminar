package dip;

public class Main {
    public static void main(String[] args) {
        Device lamp = new Lamp();
        Device lamp2 = new Lamp();
        Switch switch1 = new Switch(lamp);
        Switch switch2 = new Switch(lamp2);

        switch1.toggle();
        lamp.turnOff();
        switch2.toggle();
        lamp2.turnOff();
        
    }
    

}
