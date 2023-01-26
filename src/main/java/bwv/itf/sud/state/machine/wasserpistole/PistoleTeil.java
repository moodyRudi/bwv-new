package bwv.itf.sud.state.machine.wasserpistole;

public class PistoleTeil extends PistoleStatus {

    public PistoleTeil(int ml) {
        super(ml);
    }

    @Override
    public PistoleStatus schiessen() {
        fuellMenge -= 50;
        if (fuellMenge <= 0) {
            return new PistoleLeer();
        }
        return this;
    }

    @Override
    public PistoleStatus fuellen(int ml) {
        fuellMenge += ml;
        if (fuellMenge > MAX_FUELL_MENGE) {
            return new PistoleVoll();
        }
        return this;
    }

}
