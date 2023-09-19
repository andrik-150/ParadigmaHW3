package seminar_3.adapter;

public abstract class ElectricDevice_220V extends ElectricDevice{


    public ElectricDevice_220V() {
        this.voltage = 220;
    }

    public void turnOnDevice(int incomingVoltage){
        if (checkVoltage(incomingVoltage, voltage)) {
            System.out.println("Device " + getClass().getName().toUpperCase() + "  is turned on.");
        } else {
            System.out.println("Device is turned off.");
        };
    }
}