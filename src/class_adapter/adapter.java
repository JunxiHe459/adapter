package class_adapter;

public class adapter extends power_supply implements power_supply_adapter {
    @Override
    public int zap_220V() {
        int power = zap();
        // Using the adapter to increase the voltage
        return power * 2;
    }
}
