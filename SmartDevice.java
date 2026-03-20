// task 2 25k-3044
public interface SmartDevice {
    void turnOff();
    void turnOn();
}
class SmartLight implements SmartDevice{
    @Override
    public void turnOff(){
        System.out.println("Smart Light turned OFF");
    }
    @Override
    public void turnOn(){
        System.out.println("Smart Light turned ON");
    }
}
class SmartFan implements SmartDevice {
    @Override
    public void turnOn() {
        System.out.println("Smart Fan turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Smart Fan turned OFF ");
    }
}
class SmartApp{
    public static void main(String[] args){
        SmartDevice light= new SmartLight();
        SmartDevice fan= new SmartFan();
        light.turnOn();
        light.turnOff();
        fan.turnOn();
        fan.turnOff();
    }
}