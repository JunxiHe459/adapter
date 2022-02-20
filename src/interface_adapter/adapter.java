package interface_adapter;

public abstract class adapter implements supply{

    @Override
    public int electricity() {
        return 0;
    }

    @Override
    public double water() {
        return 0;
    }

    @Override
    public boolean ethernet() {
        return false;
    }
}
