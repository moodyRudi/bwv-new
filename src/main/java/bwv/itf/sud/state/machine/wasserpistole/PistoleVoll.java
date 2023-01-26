package bwv.itf.sud.state.machine.wasserpistole;

public class PistoleVoll extends PistoleStatus {

    public PistoleVoll() {
        super(MAX_FUELL_MENGE);
    }

    @Override
    public PistoleStatus schiessen() {
        return new PistoleTeil(400);
    }

}
