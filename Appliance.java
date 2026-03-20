//task 5 25k-3044
abstract class Appliance {
    private String brand;
    public Appliance(String brand)
    {
        this.brand=brand;
    }
    public String Brand(){
        return brand;
    }
    public abstract void start();
}
 interface RemoteControl {
    void controlRemotely ();
 }
 class smartWashingMachine extends Appliance implements RemoteControl {

    public smartWashingMachine(String brand){
        super(brand);
 }
    @Override
    public void start () {
        System.out.println(Brand() + "Washing Machine starting....");

    }
    @Override
     public void controlRemotely () {
        System.out.println(Brand() + "Washing Machine is Connected to WiFi.");
    }

}

class SmartRefrigerator extends Appliance {
    public SmartRefrigerator (String Brand) {
        super (Brand);
    }

    @Override
    public void start() {
        System.out.println(Brand() + "Refrigerator is starting");
    }

}
class SmartHomeApp {
    public static void main(String[] args) {
        smartWashingMachine s1 = new smartWashingMachine("Samsung");
        s1.start();
        s1.controlRemotely();
        SmartRefrigerator fridge = new SmartRefrigerator("LG");
        fridge.start();

    }
}