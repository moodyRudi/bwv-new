package bwv.itf.sud.state.machine.wasserpistole;

public class Wasserpistole {

    private PistoleStatus status;

    public Wasserpistole() {
        status = new PistoleLeer();
    }

    public void schiessen() {
        status = status.schiessen();
    }

    public void fuellen(int ml) {
        status = status.fuellen(ml);
    }

    public boolean istLeer() {
        return status instanceof PistoleLeer;
    }

    public boolean istVoll() {
        return status instanceof PistoleVoll;
    }

}
