package seminar_3.adapter;

public class ElectricSocket implements iElectricitySupplier{
    private int voltage;

    public ElectricSocket(VoltageType voltage) {
        switch (voltage) {
            case V220 ->  this.voltage = 220;
            case V110 ->  this.voltage = 110;
        }
    }

    @Override
    public int supply_electricity() {
        return voltage;
    }
}