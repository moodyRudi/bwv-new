package bwv.itf.sud.state.machine.freundin;

public class Bockigkeit extends FreundinStatus {

    @Override
    public FreundinStatus kuessen() {
        return new Neutral();
    }

}
