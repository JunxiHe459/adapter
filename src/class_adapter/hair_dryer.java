package class_adapter;

import class_adapter.power_supply_adapter;
import org.jetbrains.annotations.NotNull;

public class hair_dryer {
    public String location;
    public int power;

    // If the hair_dyer is produced in China, it will need 220v electricity to function.
    // Otherwise, it only needs 110v electricity to function.
    public hair_dryer(String loc) {
        if (loc.equals("China")) {
            this.location = "China";
            this.power = 220;
        } else {
            this.location = "United States";
            this.power = 110;
        }
    }

    public void charge_without_plug_adapter() {
        int power = new power_supply().zap();
        if (this.power == power) {
            System.out.println("Swish Swoosh, the dryer is functioning!");
        } else {
            System.out.println("Oops, voltage does not match.");
        }
    }

    public void charge_with_plug_adapter(@NotNull power_supply_adapter p) {
        int power = p.zap_220V();
        if (this.power == power) {
            System.out.println("Swish Swoosh, the dryer is functioning!");
        } else {
            System.out.println("Oops, voltage does not match.");
        }
    }
}
