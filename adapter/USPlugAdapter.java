package seminar_3.adapter;

public class USPlugAdapter implements iElectricitySupplier{

    private int voltage;

    public USPlugAdapter(ElectricSocket electricSocket) {
        this.voltage = electricSocket.supply_electricity();
        if (this.voltage == 110)
            this.voltage = 220;
    }

    @Override
    public int supply_electricity() {
        return voltage;
    }
}