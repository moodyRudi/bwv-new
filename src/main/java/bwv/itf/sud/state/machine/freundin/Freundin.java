package bwv.itf.sud.state.machine.freundin;

public class Freundin {

    private FreundinStatus status;

    public Freundin() {
        status = new Froehlichkeit();
    }

    public void veraergern() {
        status = status.veraergern();
    }

    public void kuessen() {
        status = status.kuessen();
    }

    public FreundinStatus getStatus() {
        return status;
    }
}
