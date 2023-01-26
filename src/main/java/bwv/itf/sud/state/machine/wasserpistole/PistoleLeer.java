package bwv.itf.sud.state.machine.wasserpistole;

public class PistoleLeer extends PistoleStatus {

    public PistoleLeer() {
        super(0);
    }

    @Override
    public PistoleStatus fuellen(int ml) {
        if (ml > MAX_FUELL_MENGE) {
            return new PistoleVoll();
        }
        return new PistoleTeil(ml);
    }

}
