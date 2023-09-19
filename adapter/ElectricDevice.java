package seminar_3.adapter;

public abstract class ElectricDevice {

    protected int voltage;

    public boolean checkVoltage(int incomingVoltage, int ownVoltage){
        if (incomingVoltage == ownVoltage){
            return true;
        } else {
            return  false;
        }
    };

}