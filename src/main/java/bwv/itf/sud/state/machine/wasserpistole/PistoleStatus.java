package bwv.itf.sud.state.machine.wasserpistole;

public abstract class PistoleStatus {

    protected static final int MAX_FUELL_MENGE = 500;

    protected int fuellMenge;

    protected PistoleStatus(int ml) {
        fuellMenge = ml;
    }

    public PistoleStatus schiessen() {
        throw new UnsupportedOperationException();
    }

    public PistoleStatus fuellen(int ml) {
        throw new UnsupportedOperationException();
    }

    public int getFuellMenge() {
        return fuellMenge;
    }
}
