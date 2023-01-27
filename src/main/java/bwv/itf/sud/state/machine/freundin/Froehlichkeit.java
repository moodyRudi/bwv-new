package bwv.itf.sud.state.machine.freundin;

public class Froehlichkeit implements FreundinStatus {

    @Override
    public FreundinStatus veraergern() {
        return new Bockigkeit();
    }

}
