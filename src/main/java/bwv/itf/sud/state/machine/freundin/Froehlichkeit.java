package bwv.itf.sud.state.machine.freundin;

public class Froehlichkeit extends FreundinStatus {

    @Override
    public FreundinStatus veraergern() {
        return new Bockigkeit();
    }

}
