package interface_adapter;

public class client {
    public static void main(String[] args) {
        hair_dryer abc = new hair_dryer("United States");

        // In this case, we only need electricity supply and don't care about water or ethernet.
        // Thus, we only need our adapter to implement the electricity() function.
        adapter ada = new adapter() {
            @Override
            public int electricity() {
                return 110;
            }
        };

        abc.charge(ada);
    }
}
