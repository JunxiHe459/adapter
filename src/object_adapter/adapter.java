package object_adapter;

public class adapter implements power_supply_adapter {
    private final power_supply power;

    public adapter(power_supply p) {
        this.power = p;
    }

    @Override
    public int zap_220V() {
        int power = this.power.zap();
        // Using the adapter to increase the voltage
        return power * 2;
    }
}
