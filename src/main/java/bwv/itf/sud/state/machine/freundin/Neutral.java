package bwv.itf.sud.state.machine.freundin;

public class Neutral extends FreundinStatus {

    @Override
    public FreundinStatus kuessen() {
        return new Froehlichkeit();
    }

    @Override
    public FreundinStatus veraergern() {
        return new Bockigkeit();
    }

}
