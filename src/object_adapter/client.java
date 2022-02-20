package object_adapter;

public class client {
    public static void main(String[] args) {
        adapter ada = new adapter(new power_supply());

        // Need 220V, using adapter to generate 220V.
        new hair_dryer("China").charge_with_plug_adapter(ada);
    }
}
