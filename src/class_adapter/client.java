package class_adapter;

public class client {
    public static void main(String[] args) {
        hair_dryer a = new hair_dryer("China");
        hair_dryer b = new hair_dryer("United States");
        power_supply_adapter p = new adapter();

        // Need 220V, given 110V
        a.charge_without_plug_adapter();

        // Need 220V, using adapter to give 220V
        a.charge_with_plug_adapter(p);

        // Need 100V, given 110V
        b.charge_without_plug_adapter();
    }
}
